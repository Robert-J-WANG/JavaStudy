package exer05_mthod_more._03valueTransfer.interview;

import java.lang.reflect.Method;

/**
 * ClassName:Test
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 11:19
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a, b);
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
//    //错误方法
//    public static void method(int a, int b) {
//        a=a*10;
//        b=b*20;
//    }

    //正确方法1
    public static void method(int a, int b) {
        a = a * 10;
        b = b * 20;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        // 执行完直接退出，不执行外面的打印代码
        System.exit(0);

    }
    //正确方法2
}
