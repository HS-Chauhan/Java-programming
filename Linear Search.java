import java.util.*;

public class Main {

    public static int linearSearch(int[] arr, int size, int key){

        //traversing the array
        for(int i = 0;i < size; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr;
        arr = new int[100000];
        int n, key;

        System.out.println("Enter size of Array : ");
        n = input.nextInt();

        System.out.println("Enter elements of Array : ");
        for(int i = 0;i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Array entered : ");
        for(int i = 0;i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the element to search for : ");
        key = input.nextInt();

        int index = linearSearch(arr, n, key);

        if(index == -1){
            System.out.println("Element is not present in array : ");
        }
        else{
            System.out.println("Element is present at position " + index);
        }



        //O(1) best case
        //O(n) worst case; n = size of Array





    }
}
