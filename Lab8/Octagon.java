package Lab8;

public class Octagon extends  GeometricObject implements Comparable<Octagon> , Cloneable{
    private double side;
    public Octagon(){
    }

    public Octagon(double side){
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side > 0)
            this.side = side;
        else
            System.out.println("side is invalid");
    }

    private boolean isOctagon(){
        return side != 0;
    }


    @Override
    public int compareTo(Octagon o) {
        double diffArea = getArea() - o.getArea();
        if(diffArea > 0)
            return 1;
        else if(diffArea == 0)
            return 0;
        else
            return -1;
    }

    @Override
    public String toString(){
        if(isOctagon())
            return "created on" + getDateCreated() + "\nArea : " + getArea() + "\nPerimeter : " + getPerimeter();
        else
            return "side is invalid";
    }

    @Override
    public double getArea() {
        if(isOctagon())
            return (2+4/22)*side*side;
        else
            return 0;
    }

    @Override
    public double getPerimeter() {
        if(isOctagon())
            return side*8;
        else
            return 0;
    }

    @Override
    protected Octagon clone() throws CloneNotSupportedException{
        return (Octagon)super.clone();
    }
}
