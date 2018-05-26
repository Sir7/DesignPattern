package com.behavior.memento;

/** 
 * @Title: memento 
 * @Description: 备忘录类，即存档的内容
 * @author yang.lvsen
 * @date 2018年5月26日 下午4:53:41 
 *  
 */
public class Memento {
	
	private int hp;
    private int mp;
    private int money;

    public Memento(int hp, int mp, int money) {
        this.hp = hp;
        this.mp = mp;
        this.money = money;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getMoney() {
        return money;
    }

}
