package exer01_this.exer_01;

/**
 * ClassName:Person
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 22:25
 * @Version 1.0
 */
public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // command + n 快捷生成set和get方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void marry(Girl girl) {
        System.out.println(this.getName()+"要娶" + girl.getName());
    }

    public void shout() {
        if (this.age > 22) {
            System.out.println("我终于要结婚了");
        }
        else {
            System.out.println("还需要多谈恋爱");
        }

    }
}
