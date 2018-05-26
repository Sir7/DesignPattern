package com.behavior.interpreter;

/** 
 * @Title: Expression 
 * @Description: 抽象表达式
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:22:08 
 *  
 */
public abstract class Expression {
	
	public abstract int interpret(Context context);

    @Override 
    public abstract String toString();

}
