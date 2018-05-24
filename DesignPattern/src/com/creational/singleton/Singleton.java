package com.creational.singleton;

/** 
 * @Title: Singleton
 * @Description: 较完美的单例
 * @author yang.lvsen
 * @date 2018年5月24日 下午4:11:14
 */
public class Singleton {
	/*
	 * 通过单例模式的学习告诉我们：
		1、单例模式理解起来简单，但是具体实现起来还是有一定的难度。
		2、synchronized关键字锁定的是对象，在用的时候，一定要在恰当的地方使用（注意需要使用锁的对象和过程，可能有的时候并不是整个对象及整个过程都需要锁）。
	 */
	
	/* 私有构造方法，防止被实例化 */    
    private Singleton() {    
    }    
    
    /* 此处使用一个内部类来维护单例 */    
    private static class SingletonFactory {    
        private static Singleton instance = new Singleton();    
    }    
    
    /* 获取实例 */    
    public static Singleton getInstance() {    
        return SingletonFactory.instance;    
    }    
    
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */    
    public Object readResolve() {    
        return getInstance();    
    } 

}
