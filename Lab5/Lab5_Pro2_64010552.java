package Lab5;

public class Lab5_Pro2_64010552 {
    public static void main(String[] args) {
        System.out.println("Polygon 1");
        RegularPolygon polygon1 = new RegularPolygon();
        System.out.println("Perimeter: " + polygon1.getPerimeter());
        System.out.println("Area: " + polygon1.getArea());
        System.out.println();
        System.out.println("Polygon 2");
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        System.out.println("Perimeter: " + polygon2.getPerimeter());
        System.out.println("Area: " + polygon2.getArea());
        System.out.println();
        System.out.println("Polygon 3");
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Perimeter: " + polygon3.getPerimeter());
        System.out.println("Area: " + polygon3.getArea());
    }
}
