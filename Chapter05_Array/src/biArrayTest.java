import com.sun.tools.javac.Main;

import java.net.SocketTimeoutException;

/**
 * ClassName:biArrayTest
 * Description
 *
 * @Author Jiqiang Wang
 * @Create 4/03/23 12:10
 * @Version 1.0
 */
public class biArrayTest {
    public static void main(String[] args) {
        // 二维数组的初始化
        int[][] arr = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        // 二维数组的长度length
        System.out.println(arr.length);//3
        System.out.println(arr[0].length);//2
        System.out.println(arr[1].length);//3
        System.out.println(arr[2].length);//4

        // 获取二维数组元素
        System.out.println(arr[0]);// [I@2f92e0f4 地址值
        System.out.println(arr[0][0]);//1
        System.out.println(arr[1][2]);//5

        // 二维数组的遍历
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
