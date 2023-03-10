package exer05_mthod_more._02args;

/**
 * ClassName:argsTest
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 10/03/23 17:59
 * @Version 1.0
 */
public class argsTest {
    public static void main(String[] args) {
        argsTest test = new argsTest();
        test.print(1);//111
        test.print(1, 1, 1, 1, 1, 1, 1);//111
        //方法重载时，优先匹配确定形参个数的方法
        test.print(1,1);//222
    }

    public void print(int... nums) {
        System.out.println(111);

    }
    public void print(int i, int j){
        System.out.println(222);
    }

//     //两个方法同时出现形参个数不确定，调用方法时会报错，无法判断调用哪一个方法
//    public void print(int i, int...nums){
//
//    }

//    // 不确定个数形参放在形参列表的最后
//    public void print(int...nums, int j){
//        // 这样写是错误的
//    }
}
