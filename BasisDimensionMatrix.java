import java.util.Scanner;

 

public class Basis_Dimension_Matrix 

{

    public static double determinant(double A[][],int N)

    {

        double det=0;

        if(N == 1)

        {

            det = A[0][0];

        }

        else if (N == 2)

        {

            det = A[0][0]*A[1][1] - A[1][0]*A[0][1];

        }

        else

        {

            det=0;

            for(int j1=0;j1<N;j1++)

            {

                double[][] m = new double[N-1][];

                for(int k=0;k<(N-1);k++)

                {

                    m[k] = new double[N-1];

                }

                for(int i=1;i<N;i++)

                {

                    int j2=0;

                    for(int j=0;j<N;j++)

                    {

                        if(j == j1)

                            continue;

                        m[i-1][j2] = A[i][j];

                        j2++;

                    }

                }

                det += Math.pow(-1.0,1.0+j1+1.0)* A[0][j1] * determinant(m,N-1);

            }

        }

        return det;

    }

 

    public static void main(String args[])

    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vectors:");

        int n = sc.nextInt();

        double [][]mat = new double[n][n];

        System.out.println("Enter the vectors one by one:");

        for(int i=0; i<n; i++)

        {

            for(int j=0; j<n; j++)

            {

                mat[j][i] = sc.nextDouble();

            }

        }

        double det = determinant(mat, n);

        if(det != 0)

            System.out.println("The vectors froms the basis of R"+n+" as the determinant is non-zero");

        else

            System.out.println("The vectors doesn't form the basis of R"+n+" as the determinant is zero");

        sc.close();

    }

}
