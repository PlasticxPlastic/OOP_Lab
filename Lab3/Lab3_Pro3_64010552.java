package Lab3;
import java.util.Arrays;
import java.util.Scanner;

public class Lab3_Pro3_64010552 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size for the matrix : ");
        int matrixSize = scanner.nextInt();
        scanner.close();
        if(matrixSize <= 1)
        {
            System.out.print("Error number must more than 1");
            System.exit(1);
        }
        int[][] matrix = new int[matrixSize][matrixSize];
        for(int i = 0; i < matrixSize;i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = (int) (Math.random() * 2); // random number 0 and 1
                System.out.print(matrix[i][j]); // print matrix
            }
            System.out.println();
        }

        int countAllrows = 0,countAllcolumn = 0;

        for(int k = 0; k < matrixSize; k++)
        {
            if(isSamenumberrow(matrix,matrixSize,k)){
                System.out.println("All " +matrix[0][k] + "s on column " + k);
                countAllrows++;
            }
            if(isSamenumbercolumn(matrix,matrixSize,k)){
                System.out.println("All " +matrix[k][0] + "s on row " + k);
                countAllcolumn++;
            }
        }
        if(countAllrows == 0) {
            System.out.println("No same number in column");
        }
        if(countAllcolumn == 0) {
            System.out.println("No same number in row");
        }

        if(isDiagonal(matrix, matrixSize)) {
            System.out.println("All " + matrix[1][1] + "s is on the diagonal");
        } else{
            System.out.println("No same numbers on the diagonal");
        }

        if(isSuperdiagonal(matrix, matrixSize)) {
            System.out.println("All " + matrix[1][2] + "s is on the superdiagonal");
        } else{
            System.out.println("No same numbers on the superdiagonal");
        }

        if(isSubdiagonal(matrix, matrixSize)) {
            System.out.println("All " + matrix[matrixSize-1][matrixSize-2] + "s is on the subdiagonal");
        } else{
            System.out.println("No same numbers on the subdiagonal");
        }

    }

    public static boolean isSamenumberrow(int[][] matrix, int matrixSize, int row)
    {
        int count = 0;
        for(int i = 0; i < matrixSize;i++)
        {
            if(i < matrixSize-1){
                if(matrix[i][row] == matrix[i+1][row]){
                    count++;
                }
            }
        }
        if(count == matrixSize-1) {
            return true;
        } else{
            return false;
        }
    }
    public static boolean isSamenumbercolumn(int[][] matrix, int matrixSize, int column)
    {
        int count = 0;
        for(int i = 0; i < matrixSize;i++)
        {
            if(i < matrixSize-1){
                if(matrix[column][i] == matrix[column][i+1]){
                    count++;
                }
            }
        }
        if(count == matrixSize-1) {
            return true;
        } else{
            return false;
        }
    }
    public static boolean isDiagonal(int[][] matrix, int matrixSize)
    {
        int temp = 0;
        int count = 0;
        for(int i = 0 ; i < matrixSize;i++)
        {
            if(i < matrixSize-1)
            {
                if(matrix[i][i] == matrix[i+1][i+1])
                {
                    count++;
                }
            }
        }
        if(count == matrixSize-1) {
            return true;
        }
        else{
            return  false;
        }
    }

    public static boolean isSuperdiagonal(int[][] matrix,int matrixSize)
    {
        int count = 0;
        for(int i = 0; i < matrixSize-1;i++)
        {
            if(i < matrixSize-2)
            {
                if(matrix[i][i+1] == matrix[i+1][i+2])
                {
                    count++;
                }
            }
            else
            {
                if(count == matrixSize-2)
                {
                    count = matrixSize-1;
                }
            }
        }
        if(count == matrixSize-1) {
            return true;
        }
        else{
            return  false;
        }
    }

    public static boolean isSubdiagonal(int[][] matrix,int matrixSize)
    {
        int count = 0;
        for(int i = matrixSize-1; i >= 0;i--)
        {
            if(i > 1) {
                if(matrix[i][i-1] == matrix[i-1][i-2])
                {
                    count++;
                }
            }
        }
        if(count == matrixSize-2) {
            return true;
        }
        else{
            return  false;
        }
    }

}
