package exer05_mthod_more._03valueTransfer;

/**
 * ClassName:valueTransferTest1
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 10/03/23 20:35
 * @Version 1.0
 */
public class valueTransferTest1 {
    public static void main(String[] args) {
        //1. 基本数据类型
        int m=10;
        method1(m); //11 main函数里的局部变量m,作为实参值传递给了method1方法
        System.out.println(m);//10 这里打印的是main函数里的局部变量，但它本身的值并没有改变

        //2. 引用数据类型
        Person p=new Person();
        // 栈里常见新的变量（开辟内存空间）p,堆里创建新的对象变量（开辟内存空间），并为其属性age创建变量，初始默认值为0，同时，p的地址指向堆里的对象
        p.age=10;
        // p指向堆里的对象，并将对象的age值赋为10

        method2(p);
        // 调用新的方法，会在栈里开辟新的栈帧，在新的栈帧里创建变量
        // p(method2(Person p) 的形参)
        // 传递实参p之后，将method2的形参p的地址指向main方法里p变量的地址
        // p.age++之间价格method2的形参p指向的对象person的age加1

        System.out.println(p.age);// 11


    }
    public static void method1(int m){
        m++;
        System.out.println(m);// main函数里的局部变量，作为实参值传递给了method1方法，method1方法里的m值发生了变化
    }

    public static void method2(Person p){
        p.age++;
    }

    public static class Person{
        int age;
    }
}
