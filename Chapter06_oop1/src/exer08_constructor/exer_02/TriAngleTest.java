package exer08_constructor.exer_02;

/**
 * ClassName:TriAngleTest
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 17:12
 * @Version 1.0
 */
public class TriAngleTest {
    public static void main(String[] args) {

        //，测试1， 利用空参构造器，并使用set，get方法设置属性
        TriAngle t1=new TriAngle();
        t1.setBase(10);
        t1.setHeight(20);
        System.out.println(t1.getBase()); // base is 	10
        System.out.println(t1.getHeight());// height is 	20
        System.out.println(t1.getArea());// Area is	100

        // 测试2， 利用自定义构造器，直接设置属性
        TriAngle t2=new TriAngle(20,30);
        System.out.println(t2.getBase()); // base is 	20
        System.out.println(t2.getHeight());// height is 	30
        System.out.println(t2.getArea());// Area is	300
    }
}
