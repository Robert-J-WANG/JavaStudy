/**
 * ClassName:OneArrayTest1
 * Description
 *
 * @Author Jiqiang Wang
 * @Create 3/03/23 11:57
 * @Version 1.0
 */
public class OneArrayTest1 {
    public static void main(String[] args) {
        //5.数组初始化默认值（不给数组元素赋值，元素的默认值）

        //short型数组，初始化默认值是0 (16位)
        short[] values = new short[3];
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);//0 0 0
        }

        //int整型数组，初始化默认值是0 (32位)
        int[] values1 = new int[3];
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);//0 0 0
        }

        //float型数组，初始化默认值是0.0 (32位)
        float[] values2 = new float[3];
        for (int i = 0; i < values2.length; i++) {
            System.out.println(values2[i]);//0.0
        }

        //long型数组，初始化默认值是0 (64位)
        long[] values3 = new long[3];
        for (int i = 0; i < values3.length; i++) {
            System.out.println(values3[i]);//0 0 0
        }

        //double型数组，初始化默认值是0.0 (64位)
        double[] values4 = new double[3];
        for (int i = 0; i < values4.length; i++) {
            System.out.println(values4[i]);//0.0
        }

        //boolean型数组，初始化默认值是false (1位）
        boolean[] values5 = new boolean[3];
        for (int i = 0; i < values5.length; i++) {
            System.out.println(values5[i]);//false
        }

        //Char型数组，初始化默认值是0 (16位)
        char[] values6 = new char[3];
        for (int i = 0; i < values6.length; i++) {
            System.out.println(values6[i]);//Null
        }

        //String型数组，初始化默认值是null
        String[] values7 = new String[3];
        for (int i = 0; i < values7.length; i++) {
            System.out.println(values7[i]);//
        }
    }
}
