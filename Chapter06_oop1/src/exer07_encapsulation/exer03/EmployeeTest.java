package exer07_encapsulation.exer03;

import java.util.Scanner;

/**
 * ClassName:EmployeeTest
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 15:30
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        // 创建对象数组
        Employee[] employees=new Employee[2];

        // 循环给对象数组的元素的属性赋值
        for (int i = 0; i < employees.length; i++) {
            employees[i] =new Employee();// 实例化对象
            System.out.println("------------输入第"+(i+1)+"个员工信息--------------");
            System.out.print("name:");
            employees[i].setName(s.next());
            System.out.print("gender:");
            employees[i].setGender(s.next());
            System.out.print("age:");
            employees[i].setAge(s.nextInt());
            System.out.print("tel:");
            employees[i].setTel(s.next());
        }

        // 循环打印出对象数组的元素的信息
        System.out.println("------------员工信息--------------");
        System.out.println("ID\tname\t gender\t age\t tel");
        for (int i = 0; i < employees.length; i++) {
            System.out.print(i+1+"\t");
            System.out.println(employees[i].getInfo());
        }
        System.out.println("------------员工信息结束--------------");
    }
}
