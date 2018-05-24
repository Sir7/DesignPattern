package com.creational.singleton;

/** 
 * @Title: StaticInnerSingleton
 * @Description: ��̬�ڲ���
 * @author yang.lvsen
 * @date 2018��5��24�� ����4:26:37
 */
public class StaticInnerSingleton {
	/*
	 * �Ƿ� Lazy ��ʼ������
		�Ƿ���̰߳�ȫ����
		ʵ���Ѷȣ�һ��
		����������ʽ�����಻��ʵ���ӳټ��أ����ܽ����ò���ʼ��ռ���ڴ棻����ʽ�������̰߳�ȫ���Ʒ���������������Ӱ�졣
		�ɼ��������Ƕ���ʽ������������ʽ�����������������������⣬��û��һ�ַ������ܹ������ֵ�����ȱ�㶼�˷����������ߵ��ŵ�϶�Ϊһ�أ�
		���ǣ�Yes������������ѧϰ���ָ��õı���֮ΪInitialization Demand Holder (IoDH)�ļ�������IoDH�У�
		�����ڵ�����������һ����̬(static)�ڲ��࣬�ڸ��ڲ����д������������ٽ��õ�������ͨ��getInstance()�������ظ��ⲿʹ�á�
		���ھ�̬��������û����ΪSingleton�ĳ�Ա����ֱ��ʵ��������������ʱ����ʵ����Singleton��
		��һ�ε���getInstance()ʱ�������ڲ���SingletonHolder���ڸ��ڲ����ж�����һ��static���͵ı���instance��
		��ʱ�����ȳ�ʼ�������Ա��������Java���������֤���̰߳�ȫ�ԣ�ȷ���ó�Ա����ֻ�ܳ�ʼ��һ�Ρ�����getInstance()����û���κ��߳�������
		��������ܲ�������κ�Ӱ�졣ͨ��ʹ��IoDH�����Ǽȿ���ʵ���ӳټ��أ��ֿ��Ա�֤�̰߳�ȫ����Ӱ��ϵͳ���ܣ�
		��ʧΪһ����õ�Java���Ե���ģʽʵ�ַ�ʽ**����ȱ�����������Ա����������أ��ܶ�����������Բ�֧��IoDH����
	 */

	private static class SingletonHolder {  
		private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();  
    }  
	
    private StaticInnerSingleton (){}  
    
    public static final StaticInnerSingleton getInstance() {  
    	return SingletonHolder.INSTANCE;  
    }
}
