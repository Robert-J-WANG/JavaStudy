package exer04_method.exer06;

/**
 * ClassName:StudentUitl
 * Description: 用于封装打印学生信息的方法
 *
 * @Author Jiqiang Wang
 * @Create 9/03/23 12:28
 * @Version 1.0
 */
public class StudentUitl {
    /**
     * 打印指定年级的学生信息
     */
    public void printStudentByGrade(Student[] students, int grade){
        for (int i = 0; i < students.length; i++) {
            if (students[i].grade == 3) {
                students[i].showStudent();
            }
        }
        System.out.println("***************************");
    }

    public void printStudents(Student[] students){
        for (int i = 0; i < students.length; i++) {
            students[i].showStudent();
        }
        System.out.println("*************************");

    }

    public void sortStudent(Student[] students){
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        printStudents(students);
    }

}
