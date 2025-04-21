/**
 * 23软二
 * 23030433
 * 赵新航
 */
package demo1;

public class Cuboid extends Tridimensional{
    private double length;
    private double width;
    private double height;
    public Cuboid(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public double volume(){
        return length*width*height;
    }
    public double area(){
        return 2*(length*width+length*height+width*height);
    }
}
