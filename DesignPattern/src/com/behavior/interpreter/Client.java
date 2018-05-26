package com.behavior.interpreter;

/** 
 * @Title: Client 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:27:08 
 *  
 */
public class Client {
	
	public static void main(String[] args) {
        Context context = new Context();

        VariableExpression a = new VariableExpression("a");
        VariableExpression b = new VariableExpression("b");
        ConstantExpression c = new ConstantExpression(6);

        context.addExpression(a, 2);
        context.addExpression(b, 3);

        Expression expression = new PlusExpression(new PlusExpression(a,b),new MinusExpression(a,c));
        System.out.println(expression.toString() + " = " + expression.interpret(context));
    }

}
