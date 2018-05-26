package com.behavior.iterator;

/** 
 * @Title: Iterator 
 * @Description: 抽象迭代器
 * @author yang.lvsen
 * @date 2018年5月26日 下午3:38:20 
 *  
 */
public interface Iterator {
	
	public Song first();
	
	public Song next();
	
	public boolean hashNext();
	
	public Song currentItem();

}
