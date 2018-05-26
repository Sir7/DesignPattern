package com.behavior.strategy;

/** 
 * @Title: Mul 
 * @Description: 乘法
 * @author yang.lvsen
 * @date 2018年5月26日 下午1:52:58 
 *  
 */
public class Mul implements Compute{

	@Override
	public String compute(int first, int second) {
		return "输出结果："+first+"*"+second+"="+(first*second);
	}

}
