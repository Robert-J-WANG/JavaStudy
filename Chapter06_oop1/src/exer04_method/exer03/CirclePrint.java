package exer04_method.exer03;

/**
 * ClassName:CirclePrint
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 5/03/23 16:16
 * @Version 1.0
 */
public class CirclePrint {
    public static void main(String[] args) {
        Circle c=new Circle();
        // 调用属性
        c.radius=5;
        // 调用方法
        //1. 无返回值
        c.CaculateCircle();
        //2. 有返回值
        double area=c.CaculateCircle1();
        System.out.println("面积为："+area);
    }
}
