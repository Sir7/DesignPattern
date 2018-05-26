package com.behavior.chain_of_responsibility;

/** 
 * @Title: Handler 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午5:40:04 
 *  
 */
public abstract class Handler {
	
	/* 下家处理者 */
    private Handler nextHandler;

    public Handler getNextHandler() {
        return  nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /* 请求 */
    public abstract void handlerRequest(String str, int money);

}
