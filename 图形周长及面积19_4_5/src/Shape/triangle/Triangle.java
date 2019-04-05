package Shape.triangle;
import Shape.MyShape;

public class Triangle extends MyShape {
    private double sideA;//边A的长度
    private double sideB;//边B的长度
    private double sideC;//边C的长度
    public static final String SIDEERR = "三角形的边长不能小于0";//边长错误
    public static final String SHAPEERR = "三角形两边之和必须大于第三边";

    /**
     * 默认构造函数
     */
    public Triangle() {
        init();
    }

    /**
     * 用三边构造三角形，满足条件才可构造
     */
    public Triangle(double a, double b, double c) {
        if (isTrianglelegal(a, b, c)) {
            this.sideA = a;
            this.sideB = b;
            this.sideC = c;
        } else {
            init();//使用默认的三边
        }
    }
    /**默认的三角形各边*/
    private void init(){
        this.sideA=3;
        this.sideB=4;
        this.sideC=5;
    }
    /**判断三边是否满足两个条件，返回值boolean型*/
    private boolean isTrianglelegal(double a,double b,double c){
        //三边必须大于0
        if(a<0||b<0||c<0){
            System.out.println(SIDEERR);
            return false;
        }else if((a+b)<c||(b+c)<a||(a+c)<b){
            //两边之和大于第三边
            System.out.println(SHAPEERR);
            return false;
        }
        return true;
    }
    //计算周长
    public double getGirth(){
        return this.sideA+this.sideB+this.sideC;
    }
    //计算面积:海伦公式
    public double getArea(){
        double s=(this.sideA+this.sideB+this.sideC)/2;
        return Math.sqrt(s*(s-this.sideA)*(s-this.sideB)*(s-this.sideC));
    }
    public String toString(){
        return "三角形的名字是："+this.name+",它的三条边的边长分别是："+this.sideA+","+this.sideB+","+this.sideC;
    }
    //主方法
    public static void main(String[] args) {
        Triangle test=new Triangle(5,6,7);
        //为三角形设置名字
        test.setName("myTriangle");
        System.out.println(test.getGirth());
        System.out.println(test.getArea());
    }
}
