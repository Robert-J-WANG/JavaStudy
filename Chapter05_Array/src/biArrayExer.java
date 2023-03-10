/**
 * ClassName:biArrayExer
 * Description:打印职员表
 *
 * @Author Jiqiang Wang
 * @Create 4/03/23 12:44
 * @Version 1.0
 */
public class biArrayExer {
    public static void main(String[] args) {
        //1.二维数组初始化
        String[][] employees = {
                {"10", "1", "jack", "23", "8000", "2000", "6000"},
                {"11", "2", "maxi", "27", "9000"},
                {"12", "3", "jett", "29", "6000", "2000", "6000"},
                {"13", "4", "pete", "20", "5000"},
        };
        System.out.println("职位\t\t编号\t姓名\t\t年龄\t薪资\t\t奖金\t\t股票");
        for (int i = 0; i < employees.length; i++) {

            switch (employees[i][0]){
                case "10":
                    employees[i][0]="架构师";
                    break;
                case "11":
                    employees[i][0]="程序员";
                    break;
                case "12":
                    employees[i][0]="测试员";
                    break;
                case "13":
                    employees[i][0]="产品经理";
                    break;
            }
            for (int j = 0; j < employees[i].length; j++) {
                System.out.print(employees[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
