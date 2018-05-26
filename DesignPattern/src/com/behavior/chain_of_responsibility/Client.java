package com.behavior.chain_of_responsibility;

/** 
 * @Title: Client 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:42:20 
 *  
 */
public class Client {

	public static void main(String[] args) {
        Brother brother = new Brother();
        Father father = new Father();
        Mother mother = new Mother();

        //指定下家
        brother.setNextHandler(father);
        father.setNextHandler(mother);

        brother.handlerRequest("要钱",1200);
    }
}
