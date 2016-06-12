package com.ju.billing.client;

import java.math.BigDecimal;

public class BigTest {

	/**
	 * 提供精确的加法运算
	 * @param v1 参数1
	 * @param v2 参数2
	 * @return 两个参数的和
	 */
	public static double add(double v1,double v2){
		BigDecimal a=new BigDecimal(v1);
		BigDecimal b=new BigDecimal(v2);
		return a.add(b).doubleValue();
	}
	
	/**
	 * 提供精确的减法运算
	 * @param v1 参数1
	 * @param v2 参数2
	 * @return 两个参数的差
	 */
	public static double sub(double v1,double v2){
		BigDecimal a=new BigDecimal(v1);
		BigDecimal b=new BigDecimal(v2);
		return a.subtract(b).doubleValue();
	}
	

	/**
	 * 提供精确的乘法运算
	 * @param v1 参数1
	 * @param v2 参数2
	 * @return 两个参数的积
	 */
	public static double mul(double v1,double v2){
		BigDecimal a=new BigDecimal(v1);
		BigDecimal b=new BigDecimal(v2);
		return a.multiply(b).doubleValue();
	}
	
	/**
	 * 提供精确的除法运算<四舍五入保留有效小数>
	 * @param v1 参数1
	 * @param v2 参数2
	 * @param scale 表示精确到小数点后几位
	 * @return
	 */
	public static double div(double v1,double v2,int scale) {  
		if(scale<0){   
			throw new IllegalArgumentException("The scale must be a positive integer or zero");   
		}  
		BigDecimal a=new BigDecimal(v1);
		BigDecimal b=new BigDecimal(v2);
		BigDecimal result = a.divide(b, scale,BigDecimal.ROUND_HALF_UP);
	    return result.doubleValue();  
	} 

	/**
	 * 四舍五入保留有效小数
	 * @param big
	 * @param scale 表示精确到小数点后几位
	 * @return
	 */
	 public static double round(double val,int scale) { 
		BigDecimal big=new BigDecimal(val);
		BigDecimal result = big.divide(new BigDecimal(1),scale,BigDecimal.ROUND_HALF_UP);
	    return result.doubleValue();  
	 } 
	
	 /**
	  * 比较两个数的大小
	  * @param v1 参数1
	  * @param v2 参数2
	  * @return v1>=v2 返回 true(1,0),否则false(-1).
	  */
	 public static boolean compare(double v1,double v2){
		BigDecimal a=new BigDecimal(v1);
		BigDecimal b=new BigDecimal(v2);
		return a.compareTo(b)>=0?true:false;
	 }
	 
	public static void main(String[] args) {
//		double b=add(1.3,2.5);
//		sdouble b=sub(1.3,2.5);
//		double b=mul(1.3,2.5);
//		double b=round(2.345555,3);
		boolean b=compare(2.3, 2.4);
		System.out.println(b);
	}
}
