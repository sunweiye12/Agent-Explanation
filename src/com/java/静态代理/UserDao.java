package com.java.静态代理;

/*接口实现目标对象*/
public class UserDao implements IUserDao {    
    public void save() {        
        System.out.println("----已经保存数据!----");    
    }
}