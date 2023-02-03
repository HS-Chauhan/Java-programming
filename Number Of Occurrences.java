import java.util.Scanner;

public class noOfOccurrences {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = in.nextInt();
        System.out.print("Enter the digit : ");
        int x = in.nextInt();

        int count = 0;

        while(n>0){
            int rem = n % 10;
            if(rem == x)
                count++;
            n = n / 10;
        }
        System.out.println(count);
        }
}
