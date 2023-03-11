package exer08_constructor.exer_01;

/**
 * ClassName:Student
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 16:53
 * @Version 1.0
 */
public class Student {
    //申明4个属性
    private String name;
    private int age;
    private String school;
    private String major;

    // 申明3个构造器
    Student(String n, int a) {
        name = n;
        age = a;
    }

    Student(String n, int a, String s) {
        name = n;
        age = a;
        school = s;
    }

    Student(String n, int a, String s, String m) {
        name = n;
        age = a;
        school = s;
        major = m;
    }

    public String getInfo() {
        return "name:" + name + ",age:" + age + ",school:" + school + ",major:" + major;
    }
}
