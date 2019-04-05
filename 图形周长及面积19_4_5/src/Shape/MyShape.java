package Shape;
/**自定义图形的基类——抽象类*/
public abstract class MyShape {
    /**形状名字,需要一个获取名字的方法*/
    protected String name;//protected访问控制符：只有本类和其子类能访问此属性
    /**获取形状的周长*/
    public abstract double getGirth();
    /**获取形状的面积*/
    public abstract double getArea();
    /**输出该图形的形状*/
    public abstract String toString();
    /**获取形状名字的的方法*/
    public void setName(String name){
        this.name=name;
    }
    /**可在主方法中获取该形状的名字*/
    public String getName(){
        return this.name;
    }
}
