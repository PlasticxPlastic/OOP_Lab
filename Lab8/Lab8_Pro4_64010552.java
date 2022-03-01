package Lab8;

public class Lab8_Pro4_64010552 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = (Octagon) octagon1.clone();

        int compareOctagon = (octagon1.compareTo(octagon2));

        System.out.println(octagon1.toString());
        System.out.println();
        if(compareOctagon == 1){
            System.out.println("Octagon1 > Octagon clone");
        }
        else if(compareOctagon == 0){
            System.out.println("Octagon1 = Octagon clone");
        }
        else
            System.out.println("Octagon1 < Octagon clone");

    }
}
