import java.util.*;

public class powerOf2 {



    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = in.nextInt();

        if(n == 0){
            System.out.println("No");
        }
        else{
            while(n % 2 == 0){
                n /= 2;
            }
            if(n == 1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

        in.close();

    }
}
