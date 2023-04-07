    import java.util.Scanner;

    public class largestAndSecond

    {

    	public static void main (String[] args)

    	{

    		Scanner scn = new Scanner (System.in);

    		System.out.print("Enter no. of elements you want in array:");

                    int n = scn.nextInt();

     

    		int array[] = new int[n];

                    System.out.println("Enter all the elements:");

    		for (int i = 0; i < array.length; i++)

    		{

    			array[i] = scn.nextInt();

    		}

     

    		int largest1, largest2, temp;

     

    		largest1 = array[0];

    		largest2 = array[1];

     

    		if (largest1 < largest2)

    		{

    			temp = largest1;

    			largest1 = largest2;

    			largest2 = temp;

    		}

     

    		for (int i = 2; i < array.length; i++)

    		{

    			if (array[i] > largest1)

    			{

    				largest2 = largest1;

    				largest1 = array[i];

    			}

    			else if (array[i] > largest2 && array[i] != largest1)

    			{

    				largest2 = array[i];

    			}

    		}

     

    		System.out.println ("The First largest is " + largest1);

    		System.out.println ("The Second largest is " + largest2);

     

    	}

    }
