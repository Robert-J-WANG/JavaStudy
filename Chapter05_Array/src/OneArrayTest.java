/**
 * ClassName:OneArrayTest
 * Description
 *
 * @Author Jiqiang Wang
 * @Create 3/03/23 10:54
 * @Version 1.0
 */
public class OneArrayTest {
    public static void main(String[] args) {
        //1. 数组的申明和初始化
        //1.1 静态初始化
        //申明数组变量名
        double[] prices;
        //初始化：给数组变量赋值，同时也给数组元素赋值
        prices = new double[]{20.32, 34.20, 44.55};
        // 可以直接连写，申明数组变量名并赋值
        int[] nums = new int[]{0, 0, 2, 6};
        //或者直接简写
        String[] names = {"熊大", "熊二", "光头强"};

        //1.2 动态初始化
        // 数组变量名的申明和赋值（一个空数组）
        String[] foods = new String[4]; // 创建了空的数组
        // 再给数组元素赋值
        foods[0] = "宫保鸡丁";
        foods[1] = "鱼香肉丝";
        foods[2] = "麻婆豆腐";
        foods[3] = "麻婆豆腐";

        //2. 元素的调用
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
//        System.out.println(names[3]);
        //异常报错ArrayIndexOutOfBoundsException，
        //超出了数组的长度Index 3 out of bounds for length 3

        //3. 数组的长度length
        System.out.println(foods.length);//4
        //4. 数组的遍历: for循环
        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i]);
        }
    }
}
