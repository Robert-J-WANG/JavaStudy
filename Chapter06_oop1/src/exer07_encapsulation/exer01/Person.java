package exer07_encapsulation.exer01;

import java.util.Set;

/**
 * ClassName:Person
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 14:39
 * @Version 1.0
 */
public class Person {
    //私有化属性
    private int age;
    // 设置属性的方法
    public void setAge(int num){
        if(num < 0||num>130){
            System.out.println("输入非法年龄，请重试一下");
        }
        else{
            age=num;
        }
    }
    // 获取属性的方法
    public int getAge(){
        return age;
    }

    // 错误写法，将2个方法合并为一个， 这样耦合度高，无法实现单个逻辑功能(比如，想单独获取年龄时，得需要输入一个年龄值，得到的确实自己输入的值，无法得到某个当前的年龄值），建议一个功能写一个方法，使用时，可以对多个方法组合使用
    public int doAge(int num){
        if(num < 0||num>130){
            System.out.println("输入非法年龄，请重试一下");
            return - 1;
        }
        else{
            age=num;
            return age;
        }
    }
}
