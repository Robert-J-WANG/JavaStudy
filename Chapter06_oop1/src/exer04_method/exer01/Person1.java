package exer04_method.exer01;

/**
 * ClassName:Person1
 * Description:创建person类，设置属性和方法
 *
 * @Author Jiqiang Wang
 * @Create 5/03/23 14:50
 * @Version 1.0
 */
public class Person1 {
    String name;
    int age;
    char gender;

    public void study(){
        System.out.println("studying");
    }
    public int showAge(){
        return age;
    }
    public void addAge(int addAge){
        age+=addAge;
    }
}
