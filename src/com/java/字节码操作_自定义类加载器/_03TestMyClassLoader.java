package com.java.�ֽ������_�Զ����������;

/*
 * ���ڲ����Զ����������
 */
import java.lang.reflect.Method;

public class _03TestMyClassLoader {

	public static void main(String[] args) throws Exception {
		//����һ���Զ����������ʵ��
		_02MyClassLoader classLoader = new _02MyClassLoader();
		//����ȫ����,���ָ��Ŀ¼��(D:\temp)����class�ļ�
		Class clazz = classLoader.findClass("com.guanpj.AutoGenerateClass");
		//ͨ��class�ļ�����������ʵ�� --- ���¾��Ƿ��������
		Object object = clazz.newInstance();
		Method showMethod = clazz.getMethod("show", null);
		showMethod.invoke(object, null);
	}
}
