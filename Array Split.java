    import java.util.Scanner;

    public class ArraySplit

    {

        public static void main(String[] args) 

        {

            int n, x, flag = 1, loc = 0, k = 0,j = 0;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter no. of elements you want in array:");

            n = s.nextInt();

            int a[] = new int[n];

            int b[] = new int[n];

            int c[] = new int[n];

            System.out.println("Enter all the elements:");

            for (int i = 0; i < n; i++) 

            {

                a[i] = s.nextInt();

            }

            System.out.print("Enter the position from where you want to split:");

            loc = s.nextInt();

            for(int i = 0; i < loc; i++)

            {

                b[k] = a[i];

                k++;

            }

            for(int i = loc; i < n; i++)

            {

                c[j] = a[i];

                j++;

            }

            System.out.print("First array:");

            for(int i = 0;i < k; i++)

            {

                System.out.print(b[i]+" ");

            }

            System.out.println("");

            System.out.print("Second array:");

            for(int i = 0; i < j; i++)

            {

                System.out.print(c[i]+" ");

            }

        }

    }
