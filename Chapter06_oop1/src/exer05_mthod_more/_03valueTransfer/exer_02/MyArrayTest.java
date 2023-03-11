package exer05_mthod_more._03valueTransfer.exer_02;

/**
 * ClassName:MyArrayTest
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 5/03/23 16:48
 * @Version 1.0
 */
public class MyArrayTest {
    public static void main(String[] args) {
        //给一个用于测试的数组
        int [] arr={11,26,37,49,55,105,3,886};
        //实例化一个对象
        MyArray myArr=new MyArray();

        //调用方法
        //最大值
        int maxValue=myArr.getMax(arr);
        System.out.println("最大值是："+maxValue);

        //最小值
        int minValue=myArr.getMin(arr);
        System.out.println("最小值是："+minValue);

        //总和
        int sumValue=myArr.getSum(arr);
        System.out.println("总和是："+sumValue);

        //平均值
        int  avgValue=myArr.getAvg(arr);
        System.out.println("平均值是："+avgValue);

        // 遍历
        myArr.print(arr);
        // 复制
        myArr.copy(arr);
        // 翻转
        myArr.reverse(arr);
        // 排序
        myArr.sort(arr);
        // 升序
        myArr.sort(arr,"ascend");
        // 降序
        myArr.sort(arr,"descend");
        // 输入错误
        myArr.sort(arr,"");


        // 查找
        int target=9;
        int index=myArr.linearSearch(arr,target);
        if(index>=0){
            System.out.println(target+" 找到了，位置索引是"+index);
        }
        else{
            System.out.println(target+" 没有找到");
        }
    }
}
