package exer04_method.exer05;

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


        // 创建对象数组
        StudentObject[] students = new StudentObject[20];//生成了20个学生对象
        // 给数组元素（Student对象）赋值，for循环
        for (int i = 0; i < students.length; i++) {
            // 利用循环，一次性创建了20个学生对象
            students[i] = new StudentObject();
            // 相当于
//            students[0]=new Student();
//            students[1]=new Student();
//            ...
//            students[19]=new Student();

            // 给学生对象赋值
            students[i].num = i + 1;
            students[i].grade = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
        }

        // 需求1， 打印出3年级学生的信息
        for (int i = 0; i < students.length; i++) {
            if (students[i].grade == 3) {
                students[i].showStudent();
            }
        }
        System.out.println("***************************");
        // 需求2， 按学生成绩排序,并打印学生信息
        //打印排序前信息
        for (int i = 0; i < students.length; i++) {
            students[i].showStudent();
        }
        System.out.println("*************************");

        //排序
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].score > students[j + 1].score) {
                    StudentObject temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        //打印排序后信息
        for (int i = 0; i < students.length; i++) {
            students[i].showStudent();
        }
    }
}
