package com.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/** 
 * @Title: MySongList 
 * @Description: 具体容器，集成抽象容器，并定义一个具体迭代器内部类
 * @author yang.lvsen
 * @date 2018年5月26日 下午3:40:15 
 *  
 */
public class MySongList implements SongList{

	public List<Song> list = new ArrayList<>();

    public MySongList(List<Song> list) {
        this.list = list;
    }

    @Override 
    public Iterator getIterator() {
        return new SongListIterator();
    }

    private class SongListIterator implements Iterator {

        private int cursor;

        @Override 
        public Song first() {
            cursor = 0;
            return list.get(cursor);
        }

        @Override 
        public Song next() {
            Song song = null;
            cursor++;
            if(hashNext()) {
                song = list.get(cursor);
            }
            return song;
        }

        @Override 
        public boolean hashNext() {
            return !(cursor == list.size());
        }

        @Override 
        public Song currentItem() {
            return list.get(cursor);
        }
    }
    
}
