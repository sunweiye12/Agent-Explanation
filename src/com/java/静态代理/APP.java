package com.java.��̬����;

/** * ������ */
public class APP {
	
	public static void main(String[] args) {
		//����Ŀ�����  
		UserDao target = new UserDao();
		//�������,��Ŀ����󴫸��������,���������ϵ�����ɴ������   
		UserDaoProxy proxy = new UserDaoProxy(target);
		//ִ�е��Ǵ���ķ���
		proxy.save();
	}
}
