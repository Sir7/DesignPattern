package com.behavior.interpreter;

/** 
 * @Title: PlusExpression 
 * @Description: 非终结符表达式
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:22:52 
 *  
 */
public class PlusExpression extends Expression{
	
	private Expression leftExpression;
    private Expression rightExpression;

    public PlusExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override 
    public int interpret(Context context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }

    @Override 
    public String toString() {
        return leftExpression.toString() + " + " + rightExpression.toString();
    }

}
