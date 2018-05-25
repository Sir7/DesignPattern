package com.structured.composite;

/** 
 * @Title: Client
 * @Description: 客户端测试
 * @author yang.lvsen
 * @date 2018年5月25日 下午3:02:31
 */
public class Client {
	/*
	 * 使用了合并模式，如果此时我们要新增一个菜品，只需继承抽象构建类，无需改动其他类，显得更加方便。
	 */

	public static void main(String[] args) {
		AbstractMenu mainMenu = new Menu("大菜单","包含所有子菜单");
		
		AbstractMenu milkTea = new MilkTea("珍珠奶茶","珍珠+奶茶",5);
		AbstractMenu juice = new Juice("鲜橙汁","果汁饮料",8);
		AbstractMenu drinkMenu = new Menu("饮品菜单","都是喝的");
		drinkMenu.add(juice);
		drinkMenu.add(milkTea);
		
		AbstractMenu ball = new FishBall("咖喱鱼蛋","加辣",6);
		AbstractMenu cake = new HandCake("培根手抓饼","正宗台湾风味",8);
		AbstractMenu eatMenu = new Menu("小吃菜单","都是你吃的");
		eatMenu.add(cake);
		eatMenu.add(ball);

		
		mainMenu.add(drinkMenu);
		mainMenu.add(eatMenu);
		
		System.out.println(mainMenu.getString());
	}
}
