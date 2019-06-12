package com.java.字节码操作_自定义类加载器;

/*
 * 用于测试自定义类加载器
 */
import java.lang.reflect.Method;

public class _03TestMyClassLoader {

	public static void main(String[] args) throws Exception {
		//创建一个自定义加载器的实例
		_02MyClassLoader classLoader = new _02MyClassLoader();
		//传入全类名,会从指定目录下(D:\temp)加载class文件
		Class clazz = classLoader.findClass("com.guanpj.AutoGenerateClass");
		//通过class文件来创建对象实例 --- 以下就是反射的内容
		Object object = clazz.newInstance();
		Method showMethod = clazz.getMethod("show", null);
		showMethod.invoke(object, null);
	}
}
