package exer05_mthod_more._04recursion;

/**
 * ClassName:RecursionTest
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 12:06
 * @Version 1.0
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();
        //1， 没有限制条件时，导致栈内存溢出的错误
//        test.method1();

        //2. 正确的使用场景
        //场景1：求1-100之间数的和

        // 循环方法
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println("sum="+sum);
        // 递归方法
        int result=test.getSum(100);
        System.out.println("sum="+result);

        //场景2：计算n!
        long result2=test.getMult(20);
        System.out.println("result="+result2);
    }

//    /**
//     * 如下递归方法的调用会导致栈内存溢出的错误StackOverflowError
//     */
//    public void method1() {
//        System.out.println("method1..........");
//        method1();
//    }

    public int getSum(int n){

        if(n==1){
            return 1; //限制溢出的条件
        }
        else {
            return n+getSum(n-1);
        }
    }
    public long getMult(int n){
        if (n == 1) {
            return 1;//限制溢出的条件
        }
        else {
            return n*getMult(n-1);
        }
    }

}

