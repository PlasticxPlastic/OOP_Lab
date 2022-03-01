package Lab8;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{

    private double width;
    private double height;

    Rectangle(){
    }

    Rectangle(double width,double height){
        setHeight(height);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>0)
            this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0)
            this.height = height;
    }

    @Override
    public int compareTo(Rectangle o) {
        double diffArea = getArea() - o.getArea();
        if(diffArea > 0)
            return 1;
        else if(diffArea == 0)
            return 0;
        else
            return -1;
    }

    @Override
    public boolean equals(Object o){
        return this.compareTo((Rectangle)o) == 0;
    }

    @Override
    public String toString(){
        return "created on" + getDateCreated() + "\nArea : " + getArea() + "\nPerimeter : " + getPerimeter();
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return width*2 + height*2;
    }

}
