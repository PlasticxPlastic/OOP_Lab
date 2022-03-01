package Lab8;

public class Lab8_Pro2_64010552 {
    public static void main(String[] args){
        GeometricObject[] square = {
                new Square("White",true,16),
                new Square(7),
                new Square("Blue",true,5),
                new Square(-2),
                new Square(6)
        };

        for(int i = 0; i < square.length; i++){
            System.out.println("Square " + (i+1));
            System.out.println(square[i].toString());
            ((Square)square[i]).howToColor();
            System.out.println();
        }
    }
}
