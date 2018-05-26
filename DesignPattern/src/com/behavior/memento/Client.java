package com.behavior.memento;

/** 
 * @Title: Client 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午4:55:45 
 *  
 */
public class Client {
	
	public static void main(String[] args) {
        Caretaker caretaker= new Caretaker();
        Character character = new Character(2000,1000,500);
        //存档
        System.out.println("=== 存档中... ===");
        character.showMsg();
        caretaker.setMemento(character.save());

        System.out.println("=== 单挑Boss，不敌，金钱扣除一半... ===");
        character.setHp(0);
        character.setHp(0);
        character.setHp(250);
        character.showMsg();

        //读档
        System.out.println("=== 读取存档中... ===");
        character.restore(caretaker.getMemento());
        character.showMsg();

    }

}