import java.util.*;

public class Main {

    static int binarySearch(int arr[], int left, int right, int key) {
        if (right >= left && left <= arr.length - 1) {

            //base case
            int mid = left + (right - left) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] > key)
                return binarySearch(arr, left, mid - 1, key);
            return binarySearch(arr, mid + 1, right, key);
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = new int[100000];
        int n, key;

        System.out.println("Enter size of Array : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();


        System.out.println("Enter elements of Array : ");
        for(int i = 0;i < n; i++){
            arr[i] = in.nextInt();
        }


        System.out.println("Enter element to search for : ");
        key = in.nextInt();

        int index = binarySearch(arr,0,n,key);

        if(index == -1){
            System.out.println("Element is not present in Array");
        }
        else{
            System.out.println("Element is present at position " + index);
        }
    }
}
