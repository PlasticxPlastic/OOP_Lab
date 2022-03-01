package Lab8;

public class Lab8_Pro1_64010552 {
    public static void main(String[] args){
        Triangle triangle1 = new Triangle("White",true,5,6,7);
        if(triangle1.isTriangle()){
            System.out.println(triangle1);
            System.out.printf("Area is %.2f\n",triangle1.getArea());
            System.out.println("Perimeter is " + triangle1.getPerimeter());
        }
    }
}
