package com.java.静态代理;

/** * 测试类 */
public class APP {
	
	public static void main(String[] args) {
		//创建目标对象  
		UserDao target = new UserDao();
		//代理对象,把目标对象传给代理对象,建立代理关系，生成代理对象   
		UserDaoProxy proxy = new UserDaoProxy(target);
		//执行的是代理的方法
		proxy.save();
	}
}
