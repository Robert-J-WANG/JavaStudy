import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * ClassName:OneArrayText2
 * Description: 案例2
 * 键盘输入数字，显示对应的星期日期
 *
 * @Author Jiqiang Wang
 * @Create 4/03/23 10:18
 * @Version 1.0
 */
public class OneArrayText2 {
    public static void main(String[] args) {
        // 定义星期的数组
        String[] weekdays = {"Monday", "Tuseday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        System.out.println("请输入数字（1-7),或输入0退出");
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int day = scan.nextInt();
            if (day == 0) {
                flag = false;
                System.out.println("你已退出");
            } else {
                if (day < 1 || day > 7) {
                    System.out.println("输入错误");
                } else {
                    System.out.println("今天是" + weekdays[day - 1]);
                    System.out.println("请输入数字（1-7),或输入0退出");
                }
            }
        }
        scan.close();

    }
}
