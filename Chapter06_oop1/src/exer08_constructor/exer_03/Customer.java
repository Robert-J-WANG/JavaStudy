package exer08_constructor.exer_03;

/**
 * ClassName:Customer
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 18:49
 * @Version 1.0
 */
public class Customer {
    private String firstName,lastName;
    // 可以在一个类里什么另一个类
    private Account account;
    public Customer(String f,String l){
        firstName=f;
        lastName = l;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setAccount(Account a){
        account=a;
    }
    public Account getAccount() {
        return account;
    }
}
