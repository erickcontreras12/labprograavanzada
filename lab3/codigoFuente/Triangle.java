package org.eclipse.che.examples;

public class Triangle implements Shape{
    private double base;
    private double height;
    
    public Triangle(double b, double h){
        this.base = b;
        this.height = h;
    }
    public double getArea(){
        return base*height*0.5;
    }
    
    public String toString(){
        return "Triangle[base: "+base+" height:" +height+" area:"+ getArea() +"]";
    }
}
