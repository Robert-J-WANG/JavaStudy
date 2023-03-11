package exer07_encapsulation.exer01;

/**
 * ClassName:PersonTest
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 14:39
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        // 创建Person的实例1
        Person p1=new Person();
//        p1.age=20 //无法直接调用属性了
        p1.setAge(20);
        System.out.println(p1.getAge());

        // 创建Person的实例2
        Person p2=new Person();
        p2.setAge(200);
        System.out.println(p2.getAge());//输入非法年龄，请重试一下
    }
}
