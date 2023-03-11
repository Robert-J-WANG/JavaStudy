package exer01_this.exer_01;

/**
 * ClassName:BoyGirlTest
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 22:57
 * @Version 1.0
 */
public class BoyGirlTest {
    public static void main(String[] args) {

        Boy Jacky=new Boy("Jacky",18);
        Girl lucy=new Girl("lucy", 20);
        // 测试BOY的方法
        Jacky.marry(lucy);
        Jacky.shout();

        // 测试girl的方法
        lucy.marry(Jacky);
        int reslut=lucy.compare(new Girl("lily",17));
        System.out.println(reslut);
    }
}
