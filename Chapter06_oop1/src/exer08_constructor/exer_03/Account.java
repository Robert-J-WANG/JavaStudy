package exer08_constructor.exer_03;

/**
 * ClassName:Account
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 17:32
 * @Version 1.0
 */
public class Account {
    private int ID;
    private double balance;
    private double rate;

    public void setID(int id){
        ID=id;
    }
    public int getID(){
        return ID;
    }
    public void setBalance(double bl){
        balance=bl;
    }
    public double getBalance(){
        return balance;
    }
    public void setRate(double r){
        rate=r;
    }
    public double getRate(){
        return rate;
    }

    public Account(){

    }
    public Account(int id, double bl,double r){
        ID=id;
        balance=bl;
        rate=r;
    }

    public void withdraw(double amount){

        if(amount<=balance&&amount>0){
            balance-=amount;
            System.out.println("成功取出"+amount);
        }
        else {
            System.out.println("余额不足");
        }
    }
    public void deposit(double amount){
        if (amount > 0) {
            balance+=amount;
            System.out.println("成功存入"+amount);
        }
        else {
            System.out.println("存款失败");
        }

    }
}
