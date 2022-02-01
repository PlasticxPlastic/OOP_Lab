package Lab4;
import java.util.GregorianCalendar;

public class Lab4_Pro2_64010552 {
    public static void main(String[] args)
    {
        GregorianCalendar gCal = new GregorianCalendar();
        System.out.println("Year is " + gCal.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + gCal.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + gCal.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("Day of week is " + gCal.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("----------------");

        gCal.add(GregorianCalendar.DATE, 1);

        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is " + gCal.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + gCal.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + gCal.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("Day of week is " + gCal.get(GregorianCalendar.DAY_OF_WEEK));

        System.out.print(gCal.getTime());
    }
}
