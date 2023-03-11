package exer05_mthod_more._03valueTransfer;

/**
 * ClassName:valueTransferTest3
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 09:46
 * @Version 1.0
 */
public class valueTransferTest3 {
    public static void main(String[] args) {
        valueTransferTest3 test=new valueTransferTest3();
        Data data = new Data();
        data.m=10;
        data.n=20;

        // 打印交换前的值
        System.out.println("m="+data.m+",n="+data.n);
//        //方法1 交换过程。 实现了交换
//        int temp= data.m;
//        data.m=data.n;
//        data.n=temp;

        // 方法2， 调用方法,也实现了交换
        test.swap(data);
        // 打印交换后的值
        System.out.println("m="+data.m+",n="+data.n);
    }

    static class Data{
        int m;
        int n;
    }
    public void swap(Data data){
        int temp= data.m;
        data.m=data.n;
        data.n=temp;
    }
}
