package com.java.JDK��̬����;
import com.java.��̬����.IUserDao;
import com.java.��̬����.UserDao;

/** * ������ */
public class APP {
    public static void main(String[] args) {
        // Ŀ�����
        IUserDao target = new UserDao();
        // ��Ŀ����󣬴����������
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        // ִ�з��� 
        proxy.save();
    }
}
