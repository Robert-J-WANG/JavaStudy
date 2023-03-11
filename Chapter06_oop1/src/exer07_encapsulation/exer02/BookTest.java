package exer07_encapsulation.exer02;

/**
 * ClassName:BookTest
 * Description:
 *
 * @Author Jiqiang Wang
 * @Create 11/03/23 15:10
 * @Version 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        Book book=new Book();
        book.setBookName("Hollywood");
        book.setAuthor("Jack");
        book.setPrice(100);
        System.out.println(book.bookInfo());
    }
}
