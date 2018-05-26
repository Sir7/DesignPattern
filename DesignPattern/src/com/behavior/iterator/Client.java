package com.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/** 
 * @Title: Client 
 * @Description: TODO
 * @author yang.lvsen
 * @date 2018年5月26日 下午3:44:08 
 *  
 */
public class Client {
	
	public static void main(String[] args) {
		List<Song> list = new ArrayList<>();
        list.add(new Song("空白格","杨宗纬"));
        list.add(new Song("那时候的我","刘惜君"));
        list.add(new Song("黑泽明","陈奕迅"));
        list.add(new Song("今天只做一件事","陈奕迅"));
        list.add(new Song("童话镇","陈一发儿"));
        
        MySongList songList = new MySongList(list);
        Iterator it = songList.getIterator();
        
        while(it.hashNext()){
        	System.out.println(it.currentItem().toString());
        	it.next();
        }
        /*
         * 	输出
         *  【歌名】空白格 - 杨宗纬
			【歌名】那时候的我 - 刘惜君
			【歌名】黑泽明 - 陈奕迅
			【歌名】今天只做一件事 - 陈奕迅
			【歌名】童话镇 - 陈一发儿
         */
	}

}
