import java.util.Scanner;

 

public class MatrixEquations

{

    public static void main(String args[])

    {

        char []var = {'x', 'y', 'z', 'w', 'a', 'b', 'c', 'd', 'e'};

        System.out.println("Enter the number of variables in the equations: ");

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println("Enter the coefficients of each variable for each equations");

        System.out.println("ax + by + cz + ... = d");

        int [][]mat = new int[n][n];

        int [][]constants = new int[n][1];

        for(int i=0; i<n; i++)

        {

            for(int j=0; j<n; j++)

            {

                mat[i][j] = input.nextInt();

            }

            constants[i][0] = input.nextInt();

        }

 

        System.out.println("Matrix representation is: ");

        for(int i=0; i<n; i++)

        {

            for(int j=0; j<n; j++)

            {

                System.out.print(" "+mat[i][j]);

            }

            System.out.print("  "+ var[i]);

            System.out.print("  =  "+ constants[i][0]);

            System.out.println();

        }

        input.close();

    }

}
