import java.util.Scanner;

public class nthFibonacciNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value : ");
        int n = sc.nextInt();
        int prev = 0;
        int curr = 1;
        int count = 2;

        while(count <= n){
            int temp = curr;
            curr = curr + prev;
            prev = temp;

            count++;
        }
        System.out.println(curr);
    }
}
