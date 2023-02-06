import java.util.*;

public class _2dArrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows in Array : ");
        int n = in.nextInt();
        System.out.println("Enter the number of columns in Array : ");
        int m = in.nextInt();

        int[][]arr = new int[n][m];

        System.out.println("Enter elements of Array : ");
        for(int i = 0;i < arr.length; i++){
            for(int j = 0;j < arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("Array entered : ");
        for(int i = 0;i < arr.length; i++){
            for(int j = 0;j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
