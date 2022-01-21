package Lab1;

public class Lab1_Pro2_64010552 {
    public static void main(String[] argh)
    {
        //config variable

        float a;
        float b;
        float c;
        float d;
        float e;
        float f;
        float x;
        float y;

        a = 3.4f;
        b = 50.2f;
        c = 2.1f;
        d = 0.55f;
        e = 44.5f;
        f = 5.9f;

        //Solve for X and Y

        x = ((e*d) - (b*f))/((a*d) - (b*c));
        y = ((a*f) - (e*c))/((a*d) - (b*c));

        //printout

        System.out.println("x is = " + x);
        System.out.println("y is = " + y);
    }
}
