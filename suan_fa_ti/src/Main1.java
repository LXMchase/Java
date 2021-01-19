import java.util.Scanner;
//生兔子：斐波那契数列
public class Main1{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int month=in.nextInt();
        System.out.println(get_count(month));

    }
    public static int get_count(int month){
        assert(month>=1);
        int first=1;
        int second=1;
        int month_count=1;
        while(month>2){
            month_count=first+second;
            first=second;
            second=month_count;
            month--;
        }
        return month_count;
    }
}