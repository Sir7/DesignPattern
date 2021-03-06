package com.behavior.interpreter;

/** 
 * @Title: MinusExpression 
 * @Description: 非终结符表达式
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:24:07 
 *  
 */
public class MinusExpression extends Expression{

	private Expression leftExpression;
    private Expression rightExpression;

    public MinusExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override 
    public int interpret(Context context) {
        return leftExpression.interpret(context) - rightExpression.interpret(context);
    }

    @Override 
    public String toString() {
        return leftExpression.toString() + " - " + rightExpression.toString();
    }
}
