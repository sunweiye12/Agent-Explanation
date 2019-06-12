package com.java.�ֽ������_�Զ����������;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * �Զ����������:ʵ���������ڽ׶��Զ��ļ���.class�ļ�,���ɿ��õĶ���
 * ǰ��:�̳�ClassLoader
 */
public class _02MyClassLoader extends ClassLoader {
	
	//������class�ļ���λ��  ���紫��com.guanpj.AutoGenerateClass �õ�AutoGenerateClass�ļ���·��
	/*
	 * ����ȫ����,���ش����classʵ��
	 */
	protected Class findClass(String className) {
		//�з�ȫ�����Ի��.class�ļ�
		String path = "D://temp//" + className.replace('.', '/') + ".class"; 
		byte[] classData = getClassData(path);
		return defineClass(className, classData, 0, classData.length);
	}
	
	//��.class�ļ�����Ϊһ�����������鷵��
	private byte[] getClassData(String path) {
		try {
			InputStream ins = new FileInputStream(path);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024 * 4];
			int bytesNumRead = 0;
			while ((bytesNumRead = ins.read(buffer)) != -1) {
				baos.write(buffer, 0, bytesNumRead);
			}
			return baos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}

