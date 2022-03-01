package Lab8;

import Lab7.Transaction;
import java.lang.Math;

public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3){
        super(color,filled);
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if(side1 > 0)
            this.side1 = side1;
        else
            System.out.println("side is invalid");
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if(side2 > 0)
            this.side2 = side2;
        else
            System.out.println("side is invalid");
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        if(side3 > 0)
            this.side3 = side3;
        else
            System.out.println("side is invalid");
    }

    public boolean isTriangle(){
        return this.side1 + this.side2 > this.side3 &&
                this.side1 + this.side3 > this.side2 &&
                this.side2 + this.side3 > this.side1;
    }

    @Override
    public double getArea() {
        if(isTriangle()) {
            double s = (this.side1 + this.side2 + this.side3) / 2;
            return Math.sqrt((s * (s - side1)) * (s - side2) * (s - side3));
        }
        else{
            return -1;
        }
    }

    @Override
    public double getPerimeter() {
        if(isTriangle())
            return this.side1 + this.side2 + this.side3;
        else
            return -1;
    }
}
