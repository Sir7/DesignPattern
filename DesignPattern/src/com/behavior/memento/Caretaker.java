package com.behavior.memento;

/** 
 * @Title: Caretaker 
 * @Description: 备忘录管理者类，只负责备忘录对象的传递！ 
 * @author yang.lvsen
 * @date 2018年5月26日 下午4:55:25 
 *  
 */
public class Caretaker {
	
	private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
