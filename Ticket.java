import java.util.Scanner;
public class Ticket{
	public static void main(String[] args){
		Goods goods1=new Goods("T恤",245,2);
		Goods goods2=new Goods("网球鞋",570,1);
		Goods goods3=new Goods("网球拍",320,1);
		System.out.println("******************消 费 单*********************");
		System.out.println("购买物品"+"   "+"单价"+"   "+"个数"+"   "+"金额");
		goods1.print();
		goods2.print();
		goods3.print();
		float sumMoney=goods1.figure()+goods2.figure()+goods3.figure();
		System.out.println("折扣：8折");
		System.out.println("消费总金额：   ￥"+sumMoney);
		System.out.print("实际交费：￥");
		Scanner reader=new Scanner(System.in);
		float input=reader.nextFloat();
		System.out.println('\n'+"找钱：￥"+(input-0.8*sumMoney));
		System.out.println("本次购物所获得积分是：33");
		}
}
class Goods{
	String goodsName;
	float oneMoney;
	int count;
	float money;
	float sortMoney;
	public Goods(String goodsName,float oneMoney,int count){
		this.goodsName=goodsName;
		this.oneMoney=oneMoney;
		this.count=count;
		this.sortMoney=count*oneMoney;
	}
	public float figure(){
		return this.sortMoney;
	}
	public void print(){
		System.out.println(this.goodsName+'\t'+"  ￥"+this.oneMoney+'\t'+"   "+this.count+'\t'+"￥"+this.sortMoney);
	}
}
	
	
