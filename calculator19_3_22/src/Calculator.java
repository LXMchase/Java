import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入两个数字");
        int num1 = Integer.parseInt(input.next());
        int num2 = Integer.parseInt(input.next());
        System.out.println("1.加法 2.减法 3.乘法 4.除法");
        int cal = Integer.parseInt(input.next());
        int value = counter(cal,num1,num2);
        System.out.println("value=" + value);
    }
        public  static int counter(int temp,int num1,int num2){
            if (temp == 1) {
                return num1 + num2;
            } else if (temp == 2) {
                return num1 - num2;
            } else if (temp == 3) {
                return num1 * num2;
            } else
                return num1 / num2;
        }
}
