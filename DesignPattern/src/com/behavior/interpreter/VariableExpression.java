package com.behavior.interpreter;

/** 
 * @Title: VariableExpression 
 * @Description: 变量终结符表达式
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:25:41 
 *  
 */
public class VariableExpression extends Expression{
	
	private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override 
    public int interpret(Context context) {
        return context.lookup(this);
    }

    @Override 
    public String toString() {
        return name;
    }

}
