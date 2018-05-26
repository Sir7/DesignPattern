package com.behavior.iterator;

/** 
 * @Title: Song 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午3:37:26 
 *  
 */
public class Song {
	
	public Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }

    private String name;

    private String singer;

    public String getName() { return name; }

    public void setName(String name) { this.name = name;}

    public String getSinger() { return singer; }

    public void setSinger(String singer) { this.singer = singer; }

    @Override public String toString() {
        return "【歌名】" + name + " - " + singer;
    }

}
