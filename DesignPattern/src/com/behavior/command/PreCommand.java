package com.behavior.command;

/** 
 * @Title: PreCommand 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午4:45:12 
 *  
 */
public class PreCommand implements Command{
	
	private StoryPlayer mPlayer;

    public PreCommand(StoryPlayer mPlayer) {
        this.mPlayer = mPlayer;
    }

    @Override 
    public void execute() {
        mPlayer.pre();
    }

}
