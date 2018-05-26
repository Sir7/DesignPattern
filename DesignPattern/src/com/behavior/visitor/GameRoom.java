package com.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/** 
 * @Title: GameRoom 
 * @Description: 对象结构，用来管理元素集合，并且可以迭代供访问者访问
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:35:23 
 *  
 */
public class GameRoom {
	
	private List<Machine> machines = new ArrayList<>();

    public void add(Machine machine) {
        machines.add(machine);
    }

    public void action(Player player) {
        for (Machine machine: machines) {
            machine.accept(player);
        }
    }

}
