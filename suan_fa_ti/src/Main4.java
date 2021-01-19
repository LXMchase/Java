import java.util.Scanner;

public class Main4 {
    /*
    * 密码要求:
1.长度超过8位
2.包括大小写字母.数字.其它符号,以上四种至少三种
3.不能有相同长度超2的子串重复
说明:长度超过2的子串
输入描述:
一组或多组长度超过2的子符串。每组占一行
输出描述:
如果符合要求输出：OK，否则输出NG*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            //1.长度判断
            String str2=judge(str);//返回值为OK或NG
            //3.相同长度子串超过2的不能重复
            String str3=compare(str);
            if(str2.equals(str3)){
                System.out.println(str2);
            }else {
                System.out.println("NG");
            }
        }
    }
    public static String judge(String str){
        if(str.length()<8){
            return "NG";
        }
        //2.长度超过8，对字符串中字符的四种类型：大小写字母、数字、其他符号进行判断——用数组
        int[] num=new int[4];
        for(int i=0;i<str.length();i++){
            //大写字母
            if(str.charAt(i)>=65&&str.charAt(i)<=90){
                num[0]++;
            }
            //小写字母
            else if(str.charAt(i)>=97&&str.charAt(i)<=122){
                num[1]++;
            }
            //数字
            else if(str.charAt(i)>=48&&str.charAt(i)<=57){
                num[2]++;
            }else {
                //其他字符
                num[3]++;
            }
        }
        int count=0;
        for(int i:num){
            if(i>0){
                count++;
            }
        }
        if(count>=3){
            return "OK";
        }else return "NG";
    }
    public static String compare(String str){
        int len=str.length();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int count=0;
                int a=i;
                int b=j;
                if(a<len&&b<len&&str.charAt(a)==str.charAt(b)){
                    count++;
                    a++;
                    b++;
                }
                if(count>2)
                    return "NG";
            }
        }
        return "OK";
    }
}
