import com.sun.tools.javac.Main;

/**
 * ClassName:OneArrayText1
 * Description
 * 破解房东电话号码，遍历第二个数组，得到的元素作为第一个数组的下标，得到第一个数组的元素
 * @Author Jiqiang Wang
 * @Create 4/03/23 09:56
 * @Version 1.0
 */
public class OneArrayText1 {
    public static void main(String[] args) {
        int[]arr=new int[]{8,2,1,0,3};
        int[]index=new int[]{2,0,3,2,4,0,1,3,2,3,3};

        String tel="";
        for(int i = 0; i < index.length; i++){
            int value=index[i];
            tel+=arr[value];
        }

        System.out.println("手机号码是:"+tel);//18013820100
    }
}
