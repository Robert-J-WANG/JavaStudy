package exer05_mthod_more._02args;

import java.util.concurrent.SubmissionPublisher;

/**
 * ClassName:stringConcatTest
 * Description:多个字符串拼接，字符串直接使用某个字符分割，如果没有字符串，返回空字符串
 *
 * @Author Jiqiang Wang
 * @Create 10/03/23 18:17
 * @Version 1.0
 */
public class stringConcatTest {
    public static void main(String[] args) {
        stringConcatTest test = new stringConcatTest();
        String r = test.concat("-", "hello");
        String s = test.concat("-", "hello", "world");
        String t = test.concat("/", "hello", "world","how","are","you");

        System.out.println(r);
        System.out.println(s);
        System.out.println(t);
    }

    public String concat(String operator, String... strs) {
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                result += strs[i];
            } else {
                result += (operator + strs[i]);
            }
        }
        return result;
    }
}

