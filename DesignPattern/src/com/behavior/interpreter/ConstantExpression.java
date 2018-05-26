package com.behavior.interpreter;

/** 
 * @Title: ConstantExpression 
 * @Description: 常量终结符表达式
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:26:39 
 *  
 */
public class ConstantExpression extends Expression{
	
	private int value;

    public ConstantExpression(int value) {
        this.value = value;
    }

    @Override 
    public int interpret(Context context) {
        return value;
    }

    @Override 
    public String toString() {
        return Integer.toString(value);
    }

}
