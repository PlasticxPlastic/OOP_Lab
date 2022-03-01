package Lab8;

public class Lab8_Pro3_64010552 {
    public static void main(String[] args){
        GeometricObject rectangle1 = new Rectangle(7,2);
        GeometricObject rectangle2 = new Rectangle(14,1);
        GeometricObject rectangle3 = new Rectangle(5,2);
        System.out.println("Rectangle1");
        System.out.println(rectangle1.toString());
        System.out.println();
        System.out.println("Rectangle2");
        System.out.println(rectangle2.toString());
        System.out.println();
        System.out.println("Rectangle3");
        System.out.println(rectangle3.toString());
        System.out.println();

        System.out.print("Rectangle1 is ");
        if(rectangle1.equals(rectangle2))
            System.out.print("equal to rectangle2" + "\n");
        else
            System.out.print("not equal to rectangle2" + "\n");
        System.out.print("Rectangle1 is ");
        if(rectangle1.equals(rectangle3))
            System.out.print("equal to rectangle3" + "\n");
        else
            System.out.print("not equal to rectangle3" + "\n");
    }
}
