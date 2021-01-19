import java.util.Scanner;

public class Main5 {
    /**输入一个字符串，然后对每个字符进行奇校验，最后输出校验后的二进制数(如’3’，输出：10110011)。
     *输入描述:
     * 输入包括一个字符串，字符串长度不超过100。
     * 输出描述:
     * 可能有多组测试数据，对于每组数据，对于字符串中的每一个字符，
     * 输出按题目进行奇偶校验后的数，每个字符校验的结果占一行。
     * 解析：这里将数字和字母统一看成是char类型（字符）的，所以数字3实际存储时为ASCII码中的‘3’
     */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            check(str.toCharArray());
        }
    }
    public static void check(char[] str){
        //每次只将字符串中的一个字符进行奇校验（8位）暂存于s中
        int[] s=new int[8];
        //处理str中的每一个字符，对字符进行按位操作，默认是对其7位的ASCII码进行操作
        for(int i=0;i<str.length;i++){
            //依次取出一个字符
            char c=str[i];
            int n=0x01;//用1对c进行按位与运算，每进行一次，1向左移一次
            int j=7;
            int sum=0;
            while(j>0){
                s[j]=(n&c)==0? 0:1;
                if(s[j]==1){
                    sum++;
                }
                j--;
                n=n<<1;
            }
            if(sum%2==1){
                s[j]=0;
            }else s[j]=1;
            for(int k=0;k<s.length;k++){
                System.out.print(s[k]);
            }
            System.out.println();
        }

    }
}
