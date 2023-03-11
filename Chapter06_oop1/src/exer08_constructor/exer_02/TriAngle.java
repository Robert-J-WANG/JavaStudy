package exer08_constructor.exer_02;

/**
 * ClassName:TriAngle
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 17:09
 * @Version 1.0
 */
public class TriAngle {

    //什么私有的属性
    private int base;
    private int height;

    // 创建set和get方法

    public void setBase(int b) {
        base=b;
    }
    public void setHeight(int h) {
        height=h;
    }

    public String getBase(){
        return "base is \t"+base;
    }
    public String getHeight(){
        return "height is \t"+height;
    }

    // 调出空参的构造器
    public TriAngle(){

    }

    // 创建自定义的构造器，与空参的构造器构成重载
    public TriAngle(int b, int h){
        base=b;
        height=h;
    }

    //创建计算面积的方法
    public String getArea(){
        return "Area is\t"+base*height/2;
    }
}
