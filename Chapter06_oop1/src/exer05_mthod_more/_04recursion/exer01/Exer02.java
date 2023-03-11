package exer05_mthod_more._04recursion.exer01;

/**
 * ClassName:Exer02
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 13:08
 * @Version 1.0
 */
public class Exer02 {
    public static void main(String[] args) {
        Exer02 e = new Exer02();

        for (int i = 0; i <= 10; i++) {
            System.out.println("n=" + i + ",f(n)=" + e.f(i));
        }
    }

    public int f(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 4;
        } else {
//            return f(n+2)- 2*f(n+1);// 错误，没有想正确的方向递归
            return f(n - 1) + 2 * f(n - 2);
        }
    }
}
