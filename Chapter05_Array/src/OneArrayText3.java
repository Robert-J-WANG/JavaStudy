import java.util.Scanner;

/**
 * ClassName:OneArrayText3
 * Description:输入学生的人数，输入每个学生的分数，算出最高分，列出每个学生的grade
 *
 * @Author Jiqiang Wang
 * @Create 4/03/23 11:20
 * @Version 1.0
 */
public class OneArrayText3 {
    public static void main(String[] args) {
        //1. 获取学生人数
        System.out.println("请输入学生的人数");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        //2. 获取学生的成绩,
        System.out.println("请输入" + count + "个学生的成绩");
        //定义一个数组来保存成绩
        int[] scores = new int[count];
        //什么一个变量来存储最高分
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        //3. 获取最高分
        System.out.println("做高分是：" + max);
        //4. 算下等级
        String grade;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 80) {
                grade = "A";
            } else if (scores[i] >= 70) {
                grade = "B";
            } else if (scores[i] >= 60) {
                grade = "C";
            } else if (scores[i] >= 50) {
                grade = "D";
            } else {
                grade = "E";
            }
            int num=i+1;
            System.out.println("student " + num + " score is:" + scores[i] + ", grade is: " + grade);
        }
    }
}
