class CircleValue{
		double radius;
		double area;
		void setRadius(double r){
			if(r>0){
				radius=r;
			}
		}
		double getRadius(){
			return radius;
		}
		double getArea(){
			area=3.14*radius*radius;
			return area;
		}
	}
	public class Circle{
	public static void main(String[] args){
		CircleValue circle=new CircleValue();
		double w=12.76;
		circle.setRadius(w);
		System.out.println("圆的半径"+circle.getRadius());
		System.out.println("圆的面积"+circle.getArea());
		w=100;
		circle.setRadius(w);
		System.out.println("更改圆的半径"+"w="+w);
		System.out.println("圆的半径"+circle.getRadius());
		System.out.println("圆的面积"+circle.getArea());
	}
	}

