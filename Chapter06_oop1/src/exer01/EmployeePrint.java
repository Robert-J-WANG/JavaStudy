package exer01;

import com.sun.tools.javac.Main;

/**
 * ClassName:EmployeePrint
 * Description
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
        System.out.println(staff1.id+"号员工，姓名："+staff1.name+",年龄："+staff1.age+"，工资："+staff1.salary);

        // 类的对象实例化2
        Employee staff2=new Employee();
        staff2.id=2;
        staff2.name="rose";
        staff2.age=19;
        staff2.salary=4000;
        System.out.println(staff2.id+"号员工，姓名："+staff2.name+",年龄："+staff2.age+"，工资："+staff2.salary);
    }
}
