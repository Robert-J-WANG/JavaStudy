package exer04_method.exer03;

/**
 * ClassName:Circle
 * Description: 计算圆的面积
 *
 * @Author Jiqiang Wang
 * @Create 5/03/23 16:10
 * @Version 1.0
 */
public class Circle {
    // 属性
    double radius;

    // 方法
    //1. 无返回值
    public void CaculateCircle(){
        System.out.println("面积是："+3.14*radius*radius);
    }

    //2. 有返回值
    public double CaculateCircle1(){
        return 3.14*radius*radius;
    }
}
