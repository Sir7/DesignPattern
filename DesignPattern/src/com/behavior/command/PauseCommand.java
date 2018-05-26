package com.behavior.command;

/** 
 * @Title: PauseCommand 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午4:44:11 
 *  
 */
public class PauseCommand implements Command{
	
	private StoryPlayer mPlayer;

    public PauseCommand(StoryPlayer mPlayer) {
        this.mPlayer = mPlayer;
    }

    @Override 
    public void execute() {
        mPlayer.play();
    }

}
