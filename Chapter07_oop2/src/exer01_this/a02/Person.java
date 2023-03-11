package exer01_this.a02;

/**
 * ClassName:Person
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 22:03
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;
    private String address;

    //空参构造器

    public Person(){

        // 假设有50行代码
    }
    public Person(String name){
        // 使用this调用上面的空参构造器
        this();
        this.name=name;
    }

    public Person(String name, int age, String address){
//        this.name = name;
        // 使用this调用上面的构造器
        this(name);

        this.age = age;
        this.address=address;
    }
}
