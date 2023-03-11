package exer08_constructor.exer_01;

/**
 * ClassName:StudentTest
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 16:58
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        // 通过不同的构造器可以实例化不同的对象（属性个数不同）
        Student s1=new Student("jack",18);
        System.out.println(s1.getInfo());

        Student s2=new Student("peter",30,"unitec","cs");
        System.out.println(s2.getInfo());
    }
}
