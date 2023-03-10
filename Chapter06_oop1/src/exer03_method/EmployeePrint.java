package exer03_method;

/**
 * ClassName:EmployeePrint
 * Description：将exer01，更为实用方法打印出
 *
 * @Author Jiqiang Wang
 * @Create 4/03/23 14:53
 * @Version 1.0
 */
public class EmployeePrint {
    public static void main(String[] args) {
        // 类的对象实例化1
        Employee staff1=new Employee();
        staff1.id=001;
        staff1.name="jack";
        staff1.age=18;
        staff1.salary=5000;
//        System.out.println(staff1.id+"号员工，姓名："+staff1.name+",年龄："+staff1.age+"，工资："+staff1.salary);
        // 调用对象的方法打印
        // （1）调用无返回值的方法show1
        staff1.show1(); // 在定义的方法里，利用Java内置systemout.println()方法打印出来
        // （2）调用有返回值的方法show2
        System.out.println(staff1.show2());
        // 在定义的方法里，返回字符串，调用此方法时，需要使用systemout.println()将字符串打印出来


        // 类的对象实例化2
        Employee staff2=new Employee();
        staff2.id=2;
        staff2.name="rose";
        staff2.age=19;
        staff2.salary=4000;

//        System.out.println(staff2.id+"号员工，姓名："+staff2.name+",年龄："+staff2.age+"，工资："+staff2.salary);

        // 调用对象的方法打印
        // （1）调用无返回值的方法show1
        staff2.show1(); // 在定义的方法里，利用Java内置systemout.println()方法打印出来
        // （2）调用有返回值的方法show2
        System.out.println(staff2.show2());
        // 在定义的方法里，返回字符串，调用此方法时，需要使用systemout.println()将字符串打印出来

    }
}
