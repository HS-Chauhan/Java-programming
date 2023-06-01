import java.io.BufferedReader;

import java.io.InputStreamReader;

 

public class DutchNationalFlag {

    //

    static void dutchNationalFlag(int[] array){

        int low,high,middle,temp;

        low = middle = 0;

        high = array.length-1;

        while(middle<=high){

                if(array[middle] == 0)

                {

                    temp = array[low];

                    array[low] = array[middle];

                    array[mid] = temp;

                    low = low + 1;

                    middle  = middle + 1;

                }

                else if(array[middle] == 1)

                    middle++;

                else

                {

                    temp = array[high];

                    array[high] = array[middle];

                    array[middle] = temp;

                    high = high - 1;

                }

        }

    }

 

    

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size;

        System.out.println("Enter the size of the array");

        try {

            size = Integer.parseInt(br.readLine());

        } catch (Exception e) {

            System.out.println("Invalid Input");

            return;

        }

        int[] array = new int[size];

        System.out.println("Enter array elements");

        int i;

        for (i = 0; i < array.length; i++) {

            try {

                array[i] = Integer.parseInt(br.readLine());

            } catch (Exception e) {

                System.out.println("An error occurred");

                return;

            }

        }

        System.out.println("The initial array is");

        for(i = 0;i < array.length; i++){

            System.out.print(array[i] + " ");

        }

        dutchNationalFlag(array);

        System.out.println("\nThe final array is");

        for(i = 0;i < array.length; i++){

            System.out.print(array[i] + " ");

        }

    }

}
