package exer07_encapsulation.exer03;

/**
 * ClassName:Employee
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 15:22
 * @Version 1.0
 */
public class Employee {
    private String name;
    private String gender;
    private int age;
    private String tel;

    public void setName(String n) {
        name = n;
    }

    public void setGender(String g) {
        gender = g;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setTel(String t) {
        tel = t;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getTel() {
        return tel;
    }

    public String getInfo() {
        return name + "\t\t" + gender + "\t\t" + age + "\t\t" + tel;
        //或者:只是稍微占点栈内存
//        return getName()+"\t\t"+getGender()+"\t\t"+getGender()+"\t\t"+getTel();
    }

}
