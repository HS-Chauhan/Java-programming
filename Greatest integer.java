import java.util.Scanner;

public class GreatestInteger {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the values : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int result = Math.max(c, Math.max(a,b));
        System.out.println(result);

    }
}
