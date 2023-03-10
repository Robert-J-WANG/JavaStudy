package exer03_method;

/**
 * ClassName:Employee
 * Description:将exer01，更为实用方法打印出
 *
 * @Author Jiqiang Wang
 * @Create 4/03/23 14:49
 * @Version 1.0
 */
public class Employee {
    //属性：成员变量
    int id;
    String name;
    int age;
    int salary;
    // 定义一个方法，用于打印出员工信息
    //（1） 无返回值
    public void show1(){
        // 方法中可以直接使用属性
        System.out.println(id+"号员工，姓名："+name+",年龄："+age+"，工资："+salary);
    }
    //（2）有返回值
    public String show2(){
        return id+"号员工，姓名："+name+",年龄："+age+"，工资："+salary;
    }
}
