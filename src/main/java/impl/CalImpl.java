package impl;

import com.fhs.utils.Cal;

public class CalImpl implements Cal {
    public int add(int num1, int num2) {
//        System.out.println("add方法的参数是["+num1+","+num2+"]");
        int result = num1+num2;
//        System.out.println("add方法的结果是"+result);
        return result;
    }

    public int sub(int num1, int num2) {
//        System.out.println("sub方法的参数是["+num1+","+num2+"]");
        int result = num1-num2;
//        System.out.println("sub方法的结果是"+result);
        return result;
    }

    public int mul(int num1, int num2) {
//        System.out.println("mul方法的参数是["+num1+","+num2+"]");
        int result = num1*num2;
//        System.out.println("mul方法的结果是"+result);
        return result;
    }

    public int div(int num1, int num2) {
//        System.out.println("div方法的参数是["+num1+","+num2+"]");
        int result = num1/num2;
//        System.out.println("div方法的结果是"+result);
        return result;
    }
}
