package com.java.字节码操作_自定义类加载器;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * 自定义类加载器:实现在运行期阶段自动的加载.class文件,生成可用的对象
 * 前提:继承ClassLoader
 */
public class _02MyClassLoader extends ClassLoader {
	
	//解析到class文件的位置  例如传入com.guanpj.AutoGenerateClass 得到AutoGenerateClass文件了路径
	/*
	 * 传入全类名,返回此类的class实例
	 */
	protected Class findClass(String className) {
		//切分全类名以获得.class文件
		String path = "D://temp//" + className.replace('.', '/') + ".class"; 
		byte[] classData = getClassData(path);
		return defineClass(className, classData, 0, classData.length);
	}
	
	//将.class文件加载为一个二进制数组返回
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

