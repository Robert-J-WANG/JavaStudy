package exer01_this.a01;

/**
 * ClassName:PersonTest
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 21:27
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person=new Person();
        person.setAge(10);
        Person jackson= new Person("jackson","jk@gmial.com");

    }

    public static class Person {
        private int age;
        private String name;
        private String email;

        public Person(){

        }
        public Person(int age){
            // this表明类的属性
            this.age=age;
        }
        public Person(String name, String email){
            // this表明类的属性
            this.name = name;
            this.email = email;
        }
        public void setAge(int age){
            // this表明类的属性
            this.age=age;
        }
        public int getAge(){
            // this表明类的属性
            return this.age;
        }
    }
}
