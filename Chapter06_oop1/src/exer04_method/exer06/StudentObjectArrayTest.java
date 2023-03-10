package exer04_method.exer06;

import exer04_method.exer05.StudentObject;

/**
 * ClassName:StudentObjectArrayTest
 * Description:
 * 1. 创建学生对象的数组
 * 2， 遍历数组元素， 给学生的属性赋值
 * 3， 学号从1开始递增
 * 4. 年级随机数「1，6」(int)(Math.random()*6+1)
 * 5. 成绩随机「1，100」(int)(Math.random()*101)
 * 6. 需求1， 打印出3年级学生的信息
 * 需求2， 按学生成绩排序
 *
 * @Author Jiqiang Wang
 * @Create 9/03/23 11:05
 * @Version 1.0
 */
public class StudentObjectArrayTest {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        // 创建对象数组
        // 给数组元素（Student对象）赋值，for循环
        for (int i = 0; i < students.length; i++) {
            // 利用循环，一次性创建了20个学生对象
            students[i] = new Student();

            // 给学生对象赋值
            students[i].num = i + 1;
            students[i].grade = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
        }

        // 需求1， 打印出3年级学生的信息
        StudentUitl stu = new StudentUitl();
        stu.printStudentByGrade(students, 3);

        // 需求2， 按学生成绩排序,并打印学生信息
        //打印排序前信息
        stu.printStudents(students);

        //排序并打印
        stu.sortStudent(students);
    }
}
