package com.structured.composite;

/** 
 * @Title: AbstractMenu
 * @Description: 
 * @author yang.lvsen
 * @date 2018年5月25日 下午2:45:58
 */
public abstract class AbstractMenu {
	/*
	 * 抽象出即可代表菜单又可代表菜品的类，这里我们只需要一个add，get，getString三个抽象方法，
	 * 让菜单和菜品去继承， 菜品只需完成getString方法重写，菜单需要重写add和get方法。
	 */
	
	public abstract void add(AbstractMenu am);

	public abstract AbstractMenu get(int index);
	
	public abstract String getString();
	
}
