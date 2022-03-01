package Lab8;

public class Square extends GeometricObject implements Colorable{
    private double side;
    public Square(){
    }

    public Square(double side){
        setColor(" no color");
        setSide(side);
    }

    public Square(String color,boolean filled, double side){
        super(color, filled);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side > 0)
            this.side = side;
        else
            System.out.println("Side is invalid");
    }

    private boolean isSquare(){
        return side != 0;
    }
    @Override
    public String toString(){
        if(isSquare())
            return "created on" + getDateCreated() + "\nfilled " + isFilled()
                    +"\nArea is " + getArea() + "\nPerimeter is " + getPerimeter();
        else
            return "side is invalid";
    }

    @Override
    public void howTocolor() {
        if(isSquare())
            System.out.println("Color is " + this.getColor());
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }
}
