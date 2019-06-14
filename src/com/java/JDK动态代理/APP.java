package com.java.JDK动态代理;
import com.java.静态代理.IUserDao;
import com.java.静态代理.UserDao;

/** * 测试类 */
public class APP {
    public static void main(String[] args) {
        // 目标对象
        IUserDao target = new UserDao();
        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        // 执行方法 
        proxy.save();
    }
}
