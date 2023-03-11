package exer05_mthod_more._03valueTransfer.exer_01;

/**
 * ClassName:PassObject
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 10:18
 * @Version 1.0
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject p=new PassObject();
        Circle circle = new Circle();
        p.printAreas(circle,5);
        System.out.println("now radius is "+circle.radius);
    }

    public void printAreas(Circle c, int time){
        System.out.println("Radius\t\tArea");
        int i=1;
        for (;i<=time;i++){
            c.radius=i;
            System.out.println(c.radius+"\t\t\t"+c.findArea());
        }
       c.radius=i;
    }
}
