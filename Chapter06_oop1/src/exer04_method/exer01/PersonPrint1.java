package exer04_method.exer01;

import exer04_method.exer01.Person1;

/**
 * ClassName:PersonPrint1
 * Description: 实例化person类
 *
 * @Author Jiqiang Wang
 * @Create 5/03/23 14:54
 * @Version 1.0
 */
public class PersonPrint1 {
    public static void main(String[] args) {
        //调用属性
        Person1 p1=new Person1();
        p1.name="jack";
        p1.age=12;
        p1.gender='男';
        //调用方法
        // 无返回值方法的调用，利用类的System.out.println()输出;
        p1.study();
        // 有返回值方法的调用，方法会输出返回值，需要对象使用System.out.println()输出
        p1.showAge();// 无法显示
        System.out.println(p1.showAge());// 12
        // 有形参方法的调用，需要输入实参
        p1.addAge(2);// 方法无返回值，无输出语句，只是改变了对象的属性值
        System.out.println(p1.age);//14
        //或者通过方法控制属性
        System.out.println(p1.showAge());//14

        Person1 p2=new Person1();
        System.out.println(p2.age);//0, 默认值为0
        p2.addAge(10);
        System.out.println(p2.showAge());//10
    }
}
