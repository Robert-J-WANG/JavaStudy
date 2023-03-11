package exer05_mthod_more._04recursion.exer01;

/**
 * ClassName:RabbitRecursion
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 13:25
 * @Version 1.0
 */
public class RabbitRecursion {
    public static void main(String[] args) {
        RabbitRecursion r = new RabbitRecursion();
        for (int i = 1; i <= 24; i++) {
            System.out.println("第" + i + "个月后,兔子的对数为：" + r.f(i));
        }

    }

    public int f(int month) {
        if (month == 1) {
            return 1;
        } else if (month == 2) {
            return 1;
        } else {
            return f(month - 1) + f(month - 2);
        }
    }
}
