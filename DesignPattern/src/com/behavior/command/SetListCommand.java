package com.behavior.command;

import java.util.ArrayList;
import java.util.List;

/** 
 * @Title: SetListCommand 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午4:42:36 
 *  
 */
public class SetListCommand implements Command{
	
	private StoryPlayer mPlayer;

    private List<Story> mList = new ArrayList<>();

    public SetListCommand(StoryPlayer mPlayer) {
        this.mPlayer = mPlayer;
    }

    @Override 
    public void execute() {
        mPlayer.setPlayList(mList);
    }

    public void setPlayList(List<Story> list) {
        this.mList = list;
    }

}
