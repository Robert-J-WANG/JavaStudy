package exer01_this.a02;

/**
 * ClassName:PersonTest
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 22:19
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {

        // 构造器创建对象，这个构造器虽然调用了其他构造器，但只创建了一个对象，因为只new了一次
        Person person = new Person("jack",18,"17 cleghorn ave");
    }
}
