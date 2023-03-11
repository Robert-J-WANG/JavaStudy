package exer08_constructor.exer_03;

/**
 * ClassName:CustomerTest
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 19:02
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        // 创建客户对象
        Customer js = new Customer("Jane", "Smith");
        // 创建账户对象
        Account a = new Account(1000, 2000, 1.23);
        // 账号和客户建立关系，把账户设置为客户的账户
        js.setAccount(a);

        // 开发中常使用匿名对象
        js.setAccount(new Account(1000, 2000, 1.23));

        // 取款之前打印账号信息

        System.out.println("Customer[" + js.getFirstName() + "," + js.getLastName() + "], has a cocount: id is " + js.getAccount().getID() + "," + "rate is " + js.getAccount().getRate() + ",balcance is " + js.getAccount().getBalance());

        // 对客户的账户存取操作

        // 不建议这样写，没有和客户有联系,相当于银行人员给你操作
//        a.deposit(100);//成功存入100.0
//        a.withdraw(960);//成功取出960.0
//        a.withdraw(2000);//余额不足

        // 正确写法：通过客户自己进行操作
        js.getAccount().deposit(100);
        js.getAccount().withdraw(960);
        js.getAccount().withdraw(2000);

        // 取款之后打印账号信息
        System.out.println("Customer[" + js.getFirstName() + "," + js.getLastName() + "], has a cocount: id is " + js.getAccount().getID() + "," + "rate is " + js.getAccount().getRate() + ",balcance is " + js.getAccount().getBalance());
    }
}
