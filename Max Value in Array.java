import java.util.*;

public class MaxValueInArray {

    public static int maxInteger(int[] arr, int n){
        int maxInteger = arr[0];
        for(int i = 0;i < n; i++){
            if(arr[i] > maxInteger){
                maxInteger = arr[i];
            }
        }
        return maxInteger;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[100000];
        int n;

        System.out.println("Enter the size of Array : ");
        n = in.nextInt();

        System.out.println("Enter elements of Array : ");
        for(int i = 0;i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Max value is : " + maxInteger(arr,n));
    }
}
