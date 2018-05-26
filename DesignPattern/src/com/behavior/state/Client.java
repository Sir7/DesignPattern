package com.behavior.state;

/** 
 * @Title: Client 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:49:29 
 *  
 */
public class Client {
	
	public static void main(String[] args) {
        MorningState morningState = new MorningState();
        AfternoonState afternoonState = new AfternoonState();
        EveningState eveningState = new EveningState();

        Context context = new Context();
        context.setState(morningState);
        context.setState(afternoonState);
        context.setState(eveningState);
    }

}
