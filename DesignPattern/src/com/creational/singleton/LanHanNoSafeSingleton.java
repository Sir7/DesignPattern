package com.creational.singleton;

/** 
 * @Title: EHanSingleton
 * @Description: ����ʽ���̲߳���ȫ
 * @author yang.lvsen
 * @date 2018��5��24�� ����4:21:34
 */
public class LanHanNoSafeSingleton {
	/*
	 * �Ƿ� Lazy ��ʼ������
		�Ƿ���̰߳�ȫ����
		ʵ���Ѷȣ���
		���������ַ�ʽ���������ʵ�ַ�ʽ������ʵ������������ǲ�֧�ֶ��̡߳���Ϊû�м��� synchronized�������ϸ��������������㵥��ģʽ��
		���ַ�ʽ lazy loading �����ԣ���Ҫ���̰߳�ȫ���ڶ��̲߳�������������
	 */
	
	private static LanHanNoSafeSingleton instance;
	
    private LanHanNoSafeSingleton (){}
    
    public static LanHanNoSafeSingleton getInstance() {
	    if (instance == null) {
	        instance = new LanHanNoSafeSingleton();
	    }
    	return instance;
    }

}
