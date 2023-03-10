package exer04_method.exer02;

/**
 * ClassName:Star
 * Description:
 * 方法1：在方法中打印一个10*8的*型矩形，在main方法中调用
 * 方法2：在方法中打印一个10*8的*型矩形，计算该矩形的面积，并返回该值
 * 方法3：在方法中打印一个m*n的*型矩形，计算该矩形的面积，并返回该值
 *
 * @Author Jiqiang Wang
 * @Create 5/03/23 15:23
 * @Version 1.0
 */
public class Star {
    public static void main(String[] args) {
        //也可以在方法中调用方法，需要关键字static
        //1. 实例化一个对象
        Star s=new Star();

        //2. 调用方法
        //调用方法1
        s.method1();
        //调用方法2
        int area=s.method2();// 打印出*矩形
        System.out.println("面积为："+area); // 打印出返回值
        //调用方法3
        int newArea=s.method3(5,7);//打印出星星
        System.out.println("面积为："+newArea); // 打印出返回值
    }
    public void method1() {
        for (int i = 0; i < 10; i++) {
           for (int j = 0; j < 8; j++) {
               System.out.print("*");
           }
            System.out.println();
        }
    }

//    public int method2(){
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        return 10*8;
//    }

    public int method2(){
        // 方法中调用方法
        method1();
        return 10*8;
    }


    public int method3(int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m*n;
    }
}
