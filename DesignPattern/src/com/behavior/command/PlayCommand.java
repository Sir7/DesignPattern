package com.behavior.command;

/** 
 * @Title: PlayCommand 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午4:43:19 
 *  
 */
public class PlayCommand implements Command{
	
	private StoryPlayer mPlayer;

    public PlayCommand(StoryPlayer mPlayer) {
        this.mPlayer = mPlayer;
    }

    @Override 
    public void execute() {
        mPlayer.play();
    }

}
