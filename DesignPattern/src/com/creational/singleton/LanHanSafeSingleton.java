package com.creational.singleton;

/** 
 * @Title: LanHanSafeSingleton
 * @Description: ����ʽ���̰߳�ȫ
 * @author yang.lvsen
 * @date 2018��5��24�� ����4:23:23
 */
public class LanHanSafeSingleton {
	/*
	 * �Ƿ� Lazy ��ʼ������
		�Ƿ���̰߳�ȫ����
		ʵ���Ѷȣ���
		���������ַ�ʽ�߱��ܺõ� lazy loading���ܹ��ڶ��߳��кܺõĹ��������ǣ�Ч�ʺܵͣ�99% ����²���Ҫͬ����
		�ŵ㣺��һ�ε��òų�ʼ���������ڴ��˷ѡ�
		ȱ�㣺������� synchronized ���ܱ�֤��������������Ӱ��Ч�ʡ�
		getInstance() �����ܶ�Ӧ�ó����Ǻܹؼ����÷���ʹ�ò�̫Ƶ������
	 */
	
	private static LanHanSafeSingleton instance;
	
    private LanHanSafeSingleton (){}
    
    public static synchronized LanHanSafeSingleton getInstance() {
	    if (instance == null) {
	        instance = new LanHanSafeSingleton();
	    }
	    return instance;
    }

}
