package com.creational.singleton;

/** 
 * @Title: Singleton
 * @Description: �������ĵ���
 * @author yang.lvsen
 * @date 2018��5��24�� ����4:11:14
 */
public class Singleton {
	/*
	 * ͨ������ģʽ��ѧϰ�������ǣ�
		1������ģʽ��������򵥣����Ǿ���ʵ������������һ�����Ѷȡ�
		2��synchronized�ؼ����������Ƕ������õ�ʱ��һ��Ҫ��ǡ���ĵط�ʹ�ã�ע����Ҫʹ�����Ķ���͹��̣������е�ʱ�򲢲������������������̶���Ҫ������
	 */
	
	/* ˽�й��췽������ֹ��ʵ���� */    
    private Singleton() {    
    }    
    
    /* �˴�ʹ��һ���ڲ�����ά������ */    
    private static class SingletonFactory {    
        private static Singleton instance = new Singleton();    
    }    
    
    /* ��ȡʵ�� */    
    public static Singleton getInstance() {    
        return SingletonFactory.instance;    
    }    
    
    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */    
    public Object readResolve() {    
        return getInstance();    
    } 

}
