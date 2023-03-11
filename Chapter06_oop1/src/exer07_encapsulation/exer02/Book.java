package exer07_encapsulation.exer02;

/**
 * ClassName:Book
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 15:02
 * @Version 1.0
 */
public class Book {
    //私有化属性
    private String bookName;
    private String author;
    private float price;

    public void setBookName(String bn){
        if(bn.equals("")){
            System.out.println("请输入");
        }
        else{
            bookName=bn;
        }
    }
    public String getBookName(){
        return bookName;
    }
    public void setAuthor(String a){
        if(a.equals("")){
            System.out.println("请输入");
        }
        else{
            author=a;
        }
    }
    public String getAuthor(){
        return author;
    }
    public void setPrice(float p){
        if(p==0){
            System.out.println("请输入");
        }
        else{
            price=p;
        }
    }
    public float getPrice(){
        return price;
    }

    public String bookInfo(){
        return "bookName:"+bookName+",Author:"+author+",price:"+price;
    }


}
