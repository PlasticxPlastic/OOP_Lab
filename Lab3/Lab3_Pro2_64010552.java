package Lab3;
import java.util.Arrays;
import java.util.Scanner;

public class Lab3_Pro2_64010552 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter list1: ");
        String string_input_list1 = scanner.nextLine();
        String[] list1 = string_input_list1.split(" ");
        int[] int_list1 = new int[list1.length];
        for(int i = 0; i< list1.length;i++)
        {
            int_list1[i] = Integer.parseInt(list1[i]);
        }

        System.out.print("Enter list2: ");
        String string_input_list2 = scanner.nextLine();
        String[] list2 = string_input_list2.split(" ");
        int[] int_list2 = new int[list2.length];
        for(int i = 0; i< list2.length;i++)
        {
            int_list2[i] = Integer.parseInt(list2[i]);
        }

        System.out.print("Merged list is : ");
        int[] merged_list = merge(int_list1, int_list2);
        Arrays.sort(merged_list);
        for(int i = 0; i < merged_list.length; i++)
        {
            System.out.print(merged_list[i] + " ");
        }
        scanner.close();
    }

    public  static int[] merge(int[] list1, int[] list2)
    {
        int[] merged_list = new int[list1.length + list2.length];
        for(int i = 0; i < list1.length; i++)
        {
            merged_list[i] = list1[i];
        }
        for(int i = 0; i < list2.length; i++)
        {
            merged_list[i+ list1.length] = list2[i];
        }
        return merged_list;
    }
}
