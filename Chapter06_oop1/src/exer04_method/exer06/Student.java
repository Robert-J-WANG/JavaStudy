package exer04_method.exer06;

/**
 * ClassName:StudentObjectArray
 * Description:学生类的对象，用于生成一个对象数组
 *
 * @Author Jiqiang Wang
 * @Create 9/03/23 11:02
 * @Version 1.0
 */
public class Student {
    public int num;
    public int grade;
    public int score;


    /**
     * 打印学生信息
     */
    public void showStudent(){
        System.out.println("number:" + num + ",grade:" + grade + ",score:" + score);
    }
}
