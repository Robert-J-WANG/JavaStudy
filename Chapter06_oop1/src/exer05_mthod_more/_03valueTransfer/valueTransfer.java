package exer05_mthod_more._03valueTransfer;

/**
 * ClassName:valueTransfer
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 10/03/23 19:57
 * @Version 1.0
 */
public class valueTransfer {
    public static void main(String[] args) {
        // 局部变量的值传递
        //1.基本数据类型的局部变量; 传递的是数据值
        int m = 10;
        int n = m;  // m把值传递给n
        System.out.println("m=" + m + ",n=" + n); //m=10,n=10

        m++; // m的值变化了，但n没有变，m++之后并没有把值传递给n
        System.out.println("m=" + m + ",n=" + n); //m=11,n=10

        //2.引用数据类型的局部变量,传递地址
        // 2.1 数组类型
        int[] arr1 = new int[]{1, 2, 3, 2};
        int[] arr2 = arr1; //arr2的地址指向了arr1的地址

        arr2[0] = 10;
        System.out.println(arr1[0]); //10 arr2的地址和arr1的地址相同

        // 2.2 对象类型
        Apple apple1=new Apple();
        apple1.color="red";

        Apple apple2=apple1; // 传递的是地址，指向同一个地址
        apple2.color="green";

        System.out.println(apple1.color); //green
    }
    public static class Apple{
        String color;
    }

}
