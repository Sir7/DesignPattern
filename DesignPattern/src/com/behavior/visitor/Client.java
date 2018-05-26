package com.behavior.visitor;

/** 
 * @Title: Client 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:35:58 
 *  
 */
public class Client {
	
	public static void main(String[] args) {
        GameRoom room = new GameRoom();
        room.add(new Shooting());
        room.add(new Dancing());
        room.add(new Driving());

        Player player1 = new MalePlayer();
        Player player2 = new FemalePlayer();

        room.action(player1);
        room.action(player2);
    }

}
