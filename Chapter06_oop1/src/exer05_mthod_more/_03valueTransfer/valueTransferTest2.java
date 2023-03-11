package exer05_mthod_more._03valueTransfer;

/**
 * ClassName:valueTransferTest2
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 09:30
 * @Version 1.0
 */
public class valueTransferTest2 {
    public static void main(String[] args) {
        valueTransferTest2 test=new valueTransferTest2();
         // 交换2个变量的值，并打印
        int m=10;
        int n=20;
        // 打印交换前的值
        System.out.println("m="+m+",n="+n);

//        //方法1 交换过程。 实现了交换
//        int temp=m;
//        m=n;
//        n=temp;
        //方法2，将交换过程封装成方法,并调用方法。 未实现交换
        test.swap(m,n);
        System.out.println("m="+m+",n="+n);// 没有交换成功，原因是打印的是transfer方法外面的，即main方法里的变量m和n, 而交换的是transfer方法里的值实参m和n，但并没有返回值

//        // 打印交换后的值
        System.out.println("m="+m+",n="+n);
    }
    public void swap(int m, int n){
         //交换过程
        int temp=m;
        m=n;
        n=temp;
    }
}
