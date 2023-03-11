package exer05_mthod_more._04recursion.exer01;

/**
 * ClassName:Exer01
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 12:51
 * @Version 1.0
 */
public class Exer01 {
    public static void main(String[] args) {
        Exer01 e = new Exer01();
        for (int i = 1; i <= 21; i++) {
            System.out.println("n=" + i + ",f(n)=" + e.f(i));
        }
    }

    public int f(int n) {
        if (n == 20) {
            return 1;
        }
        if (n == 21) {
            return 4;
        } else {
            return f(n + 2) - 2 * f(n + 1);
        }
    }

}
