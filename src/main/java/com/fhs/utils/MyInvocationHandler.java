package com.fhs.utils;

import java.lang.reflect.InvocationHandler; // 这个提供了生成动态代理类的功能
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;


public class MyInvocationHandler implements InvocationHandler {
    // 注意，MyInvocationHandler 不是动态代理类，而是帮助我们创建动态代理类的这么一个类
    //接收委托对象
    private Object object = null;

    //返回代理对象
    public Object bind(Object object){
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
        // object.getClass()是获得委托对象的运行时类，再 .getClassLoader()获得的是类加载器，有了类加载器就可以生成动态的一个类
        // 要求是委托类的所有功能代理类必须全部拥有， .getInterfaces() 能获得这个运行时类的所有接口，有了接口就可以动态的创建功能相同的类
        // 这个类就叫动态代理类。动态代理实际上是反射的一个很重要的应用
        // this 的意思是说，我们是通过 MyInvocationHandler 来创建动态代理对象的
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Invoke 就是用来写 CalImpl 里那些打印参数和打印结果的
        System.out.println(method.getName()+"方法的参数是："+ Arrays.toString(args));
        Object result = method.invoke(this.object,args);
        System.out.println(method.getName()+"的结果是"+result);
        return result;
    }
}