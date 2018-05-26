package com.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

/** 
 * @Title: Context 
 * @Description: 上下文环境
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:25:01 
 *  
 */
public class Context {
	
	private Map<Expression, Integer> map = new HashMap<>();

    public void addExpression(Expression expression, int value) {
        map.put(expression, value);
    }

    public int lookup(Expression expression) {
        return map.get(expression);
    }

}
