import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    //小红买珠子:第一行——商家的珠子；第二行——小红要买的珠子
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        String sell=sc.nextLine();
        String buy=sc.nextLine();
        char[] sell1=sell.toCharArray();
        char[] buy1=buy.toCharArray();
        char[] index=new char[sell1.length];
        for(int i=0;i<buy1.length;i++){
            for(int j=0;j<sell1.length;j++){
                if(buy1[i]==sell1[j])
                    index[i]++;
            }
        }*/
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s= sc.nextLine();
            String res = sc.nextLine();
            //Ctrl+P：查看方法参数
            //Ctrl+Q：查看类、方法、属性注释
            Map<Character,Integer> map = new HashMap<>();
            for (int i = 0; i < s.length();i++) {
                int length = map.getOrDefault(s.charAt(i),0);
                map.put(s.charAt(i),length+1);
            }
            int count = 0;
            for (int j = 0; j < res.length();j++) {
                int len = map.getOrDefault(res.charAt(j),0);
                if (len <= 0) {
                    count ++;
                }
                map.put(res.charAt(j),len-1);
            }
            if (count == 0) {
                System.out.println("yes" + " " + (s.length()-res.length()));
            } else {
                System.out.println("no" + " " + count);
            }
        }
        sc.close();
    }
}
