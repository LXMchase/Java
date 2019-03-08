import java.util.Scanner;
public class InputData{
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		int amount=0;
		float price=0;
		float sum=0;
		System.out.println("输入产品数量：");
		amount=reader.nextInt();
		System.out.println("输入产品单价：");
		price=reader.nextFloat();
		sum=amount*price;
		System.out.println("数量:"+sum+" 单价："+price+"总价："+sum);
	}
}
