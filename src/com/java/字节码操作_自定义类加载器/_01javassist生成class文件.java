package com.java.�ֽ������_�Զ����������;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;
/*
 * javassist ��һ���ֽ�����ݼ���
 *  �ڳ���������,ֱ��ͨ���������������class�ļ�,�洢���ض���λ��
 *  1.ͨ���ֽ�����ݼ�������class�ļ�  -->(����ͨ�������뼼������Java�ļ�(javap���߹��� jd-gui))
 *  2.ͨ���Զ�������������class�ļ����ص�JVM��
 *  3.��Test�п��Ե��÷��似�������ɴ˶���
 */
public class _01javassist����class�ļ� {
	
    public static void main(String[] args) throws Exception {        
    	 ClassPool pool = ClassPool.getDefault();
	        //���� AutoGenerateClass��        
	        CtClass cc= pool.makeClass("com.guanpj.AutoGenerateClass");
	        //���� show ����
	        CtMethod method = CtNewMethod.make("public void show(){}", cc); 
	        //���뷽���еĴ���                 
	        method.insertBefore("System.out.println(\"I'm just test generate .class file by javassit.....\");");
	        //��������ӵ�������
	        cc.addMethod(method);
	        //�������ɵ��ֽ���
	        cc.writeFile("D://temp");    
    }
}
