package exer04_method.exer02;

/**
 * ClassName:StarPrint
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 5/03/23 15:28
 * @Version 1.0
 */
public class StarPrint {
    public static void main(String[] args) {
        Star s=new Star();
        //调用方法1
        s.method1();

        //调用方法2
        int area=s.method2();// 打印出*矩形
       System.out.println("面积为："+area); // 打印出返回值

        //调用方法3
        int newArea=s.method3(5,7);//打印出星星
        System.out.println("面积为："+newArea); // 打印出返回值
    }
}
