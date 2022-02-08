package Lab5;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;


    public RegularPolygon() {
        this(3, 0, 0, 0);
    }

    public RegularPolygon(int n, double side) {
        this(n, side, 0, 0);
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    public int getN(){
        return this.n;
    }

    public double getSide(){
        return this.side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getPerimeter() {
        return this.n * this.side;
    }

    public double getArea() {
        return (this.n * Math.pow(side,2)) / (4 * Math.tan(Math.PI / this.n));
    }
}
