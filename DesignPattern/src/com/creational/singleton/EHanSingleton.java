package com.creational.singleton;

/** 
 * @Title: EHanSingleton
 * @Description: ����ʽ
 * @author yang.lvsen
 * @date 2018��5��24�� ����4:25:01
 */
public class EHanSingleton {
	/*
	 * �Ƿ� Lazy ��ʼ������
		�Ƿ���̰߳�ȫ����
		ʵ���Ѷȣ���
		���������ַ�ʽ�Ƚϳ��ã������ײ�����������
		�ŵ㣺û�м�����ִ��Ч�ʻ���ߡ�
		ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档
		������classloder���Ʊ����˶��̵߳�ͬ�����⣬������instance����װ��ʱ��ʵ������
		��Ȼ������װ�ص�ԭ���кܶ��֣�
		�ڵ���ģʽ�д�������ǵ���getInstance������ ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ�
		��ʱ���ʼ��instance��Ȼû�дﵽlazy loading��Ч����
	 */

	private static EHanSingleton instance = new EHanSingleton();  
	
    private EHanSingleton (){}  
    
    public static EHanSingleton getInstance() {  
    	return instance;  
    } 
}
