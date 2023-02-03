import java.util.Scanner;

public class ReverseInput {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = sc.nextInt();

        int ans = 0;
        while(number > 0){
            int rem = number % 10;
            number /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println(ans);
    }
}
