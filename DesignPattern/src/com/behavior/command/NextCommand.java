package com.behavior.command;

/** 
 * @Title: NextCommand 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午4:46:27 
 *  
 */
public class NextCommand implements Command{
	
	private StoryPlayer mPlayer;

    public NextCommand(StoryPlayer mPlayer) {
        this.mPlayer = mPlayer;
    }

    @Override 
    public void execute() {
        mPlayer.next();
    }

}
