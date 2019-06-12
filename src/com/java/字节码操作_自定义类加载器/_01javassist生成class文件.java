package com.java.字节码操作_自定义类加载器;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;
/*
 * javassist 是一种字节码操纵技术
 *  在程序运行期,直接通过程序生成所需的class文件,存储到特定的位置
 */
public class _01javassist生成class文件 {
	
    public static void main(String[] args) throws Exception {        
    	 ClassPool pool = ClassPool.getDefault();
	        //创建 AutoGenerateClass类        
	        CtClass cc= pool.makeClass("com.guanpj.AutoGenerateClass");
	        //定义 show 方法
	        CtMethod method = CtNewMethod.make("public void show(){}", cc); 
	        //插入方法中的代码                 
	        method.insertBefore("System.out.println(\"I'm just test generate .class file by javassit.....\");");
	        //将方法添加到此类中
	        cc.addMethod(method);
	        //保存生成的字节码
	        cc.writeFile("D://temp");    
    }
}
