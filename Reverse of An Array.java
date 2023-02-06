import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of the Array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of the Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int left = 0;
        int right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reverse of Input Array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }


    }
}
