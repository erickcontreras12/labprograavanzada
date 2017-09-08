package org.eclipse.che.examples;

public class Rectangle implements Shape{
    private double length;
    private double width;
    
    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }
    
    public double getArea(){
        return length*width;
    }
    
    public String toString(){
        return "Rectangle[width: "+width+" length:" +length+" area:"+ getArea() +"]";
    }
    
}
