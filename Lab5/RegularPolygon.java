package Lab5;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;


    public RegularPolygon() {
        this(3, 1, 0, 0);
    }

    public RegularPolygon(int n, double side) {
        this(n,side,0,0);
    }

    public RegularPolygon(int n, double side, double x, double y) {
        setN(n);
        setSide(side);
        setX(x);
        setY(y);
    }
    public int getN(){
        return this.n;
    }

    public void setN(int n) {
        if(n>=3)
            this.n = n;
        else{
            System.out.println("\"n\" should more than or equal to 3 ");
            System.exit(1);
        }
    }

    public double getSide(){
        return this.side;
    }

    public void setSide(double side) {
        if(side>0)
            this.side = side;
        else{
            System.out.println("\"side\" should more than 0 ");
            System.exit(1);
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if(x>=0)
            this.x = x;
        else{
            System.out.println("\"X\" should more than or equal to 0 ");
            System.exit(1);
        }
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if(y>=0)
            this.y = y;
        else{
            System.out.println("\"Y\" should more than or equal to 0 ");
            System.exit(1);
        }
    }

    public double getPerimeter() {
        return this.n * this.side;
    }

    public double getArea() {
        return (this.n * Math.pow(side,2)) / (4 * Math.tan(Math.PI / this.n));
    }
}
