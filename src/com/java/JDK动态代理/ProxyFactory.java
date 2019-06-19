package com.java.JDK动态代理;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** * 创建动态代理对象 * 动态代理不需要实现接口,但是需要指定接口类型 */
public class ProxyFactory{
    //维护一个目标对象
    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }

   //给目标对象生成代理对象并返回
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(  //直接调用Proxy.newProxyInstance(1,2,3)	来返回一个代理对象 三个参数
               target.getClass().getClassLoader(), 
               target.getClass().getInterfaces(), 
               new InvocationHandler() { 
                   @Override
                    public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
                        System.out.println("开始事务2喽");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("提交事务2喽");
                        return returnValue;
                    }
                }
        );
    }
}
