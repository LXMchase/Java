import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    /*
    * 对N个长度最长可达到1000的数进行排序*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int len=sc.nextInt();
            BigInteger[] num=new BigInteger[len];
            for(int i=0;i<len;i++){
                num[i]=sc.nextBigInteger();
            }
            Arrays.sort(num);
            for(int k=0;k<len;k++){
                System.out.println(num[k]);
            }
        }
    }
}
