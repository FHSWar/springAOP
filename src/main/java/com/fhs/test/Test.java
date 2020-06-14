package com.fhs.test;

import com.fhs.utils.Cal;
import com.fhs.utils.MyInvocationHandler;
import impl.CalImpl;

public class Test {
    public static void main(String[] args) {
//        Cal cal = new CalImpl();
//        cal.add(1,1);
//        cal.sub(2,1);
//        cal.mul(2,3);
//        cal.div(6,2); // 这些是传统手段
        Cal cal = new CalImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Cal cal1 = (Cal) myInvocationHandler.bind(cal);
        cal1.add(1,1);
        cal1.sub(2,1);
        cal1.mul(2,3);
        cal1.div(6,2);
    }
}
