package exer04_method.exer04;

/**
 * ClassName:MyArray
 * Description:
 * 设计自己的int 型数组，包含计算最大值，平均值等方法
 *
 * @Author Jiqiang Wang
 * @Create 5/03/23 16:41
 * @Version 1.0
 */
public class MyArray {
    /**
     * 输出数组元素中的最大值
     *
     * @param array 需要查找的数组
     * @return 数组元素中的最大值
     */
    public int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int getMin(int [] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int getSum(int[]array){
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
           sum+=array[i];
        }
        return sum;
    }

    public int getAvg(int[]array){
//        int sum = array[0];
//        int avg=0;
//        for (int i = 1; i < array.length; i++) {
//            sum+=array[i];
//            avg=sum/array.length;
//        }
//        return avg;
        //方法中调用方法
        return getSum(array)/array.length;


    }
    public void print(int[]array){

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {

            if(i==0){
                System.out.print(array[i]);
            }
            else {
                System.out.print(","+array[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public void copy(int[]array){
        int[] newArr =new int [array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i]=array[i];
        }
        // 方法中调用方法
        System.out.println("复制数组的结果是：");
        print(newArr);
    }
    public void reverse(int[]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                int temp=array[j];
                array[j]=array[array.length-j-1];
                array[array.length-j-1]=temp;
            }
        }
        System.out.println("翻转数组的结果是：");
        // 方法中调用方法
        print(array);

    }
    public void sort(int[]array){
        int value=array[0];
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("数组排序的结果是：");
        // 方法中调用方法
        print(array);
    }

    /**
     * 使用线性查找的方法，查找指定的元素
     * @param array 待查找的数组
     * @param target 要查找的元素
     * @return target元素在数组在的索引位置，若未找到，则返回-1
     */
    public int linearSearch(int[]array, int target){
        for (int i = 0; i < array.length; i++) {
            if(target==array[i]){
                return i;
            }
        }
        //只要代码执行到此位置，一定是没找到
        return -1;
    }
}
