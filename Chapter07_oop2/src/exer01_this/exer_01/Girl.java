package exer01_this.exer_01;

import javax.swing.*;

/**
 * ClassName:Girl
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 22:28
 * @Version 1.0
 */
public class Girl {
    private  String name   ;
    private  int age;
    public Girl() {
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void marry(Boy boy){
        System.out.println(this.getName()+"要嫁给"+boy.getName());
        boy.marry(this);
    }


    /***
     * 比较2个girl对象的方法（调用此方法的对象和输入形参的对象）
     * @param girl 需要进行比较的girl对象
     * @return
     */
    public int compare(Girl girl){
        if(this.age>girl.age){
            return 1;
        }
        else if(this.age<girl.age){
            return -1;
        }
        else {
            return 0;
        }
    }
}
