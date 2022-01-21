package Lab1;

public class Lab1_Pro1_64010552
{
    public static void main(String[] argh)
    {
        //config all variable
        int birthRate = 7;
        int dieRate = 13;
        int immigrantRate = 45;
        int currentPopulation = 312032486;
        int yearSec = 365*24*60*60;

        double birthTotal = (double) yearSec / (double) birthRate;
        double dieTotal = (double) yearSec / (double) dieRate;
        double immigrantTotal = (double) yearSec / (double) immigrantRate;
        int YearPopulation = (int) (birthTotal - dieTotal + immigrantTotal);

        for(int i=1;i<=5;i++)
        {
            currentPopulation = (YearPopulation * i) + currentPopulation; 
            System.out.println( i + " year population = " + currentPopulation);
        }
    }
}