package exer2;

/**
 * ClassName:EmployeePrint
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 4/03/23 15:26
 * @Version 1.0
 */
public class EmployeePrint {
    public static void main(String[] args) {
        // 实例化一个对象
        Employee staff=new Employee();
        staff.id=1;
        staff.name="peter";
        staff.age=20;
        staff.salary=10000;

        staff.birthday=new MyDate();
        staff.birthday.year=2000;
        staff.birthday.month=12;
        staff.birthday.day=12;
        System.out.println(staff.id+"号员工，姓名："+staff.name+",年龄："+staff.age+"，工资："+staff.salary+",生日："+staff.birthday.year+"-"+staff.birthday.month+"-"+staff.birthday.day);
    }
}
