/*
 * 檔名：CircleDemo.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package circledemo;

interface shape {
    public double PI = 3.14;
    public double getPerimeter();
    public double getArea();
}

public class CircleDemo implements shape {
    private double radius;
    
    public CircleDemo(double radius) {
        this.radius = radius;
    }
    
    public double getPerimeter() {
        return 2 * this.radius * this.PI;
    }
    
    public double getArea() {
        return this.PI * this.radius * this.radius;
    }
    
    public static void main(String[] args) {
        CircleDemo demo = new CircleDemo(100.1);
        System.out.println();
        System.out.println(demo.getPerimeter());
        System.out.println(demo.getArea());
        System.out.println();
    }   
}
