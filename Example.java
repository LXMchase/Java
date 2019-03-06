//打印9*9乘法表
import java.util.Scanner;
class Example{
	public static void main(String args[])throws java.io.IOException{
	Scanner in=new Scanner(System.in);
		System.out.println("please enter a number of lines!");
		int n=in.nextInt();
		int i=1;
		int j=1;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				int m=i*j;
				System.out.print(i+"*"+j+"="+m+"\t");
			}
			System.out.println();
		}
	}
}


