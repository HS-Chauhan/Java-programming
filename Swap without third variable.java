import java.util.*;

public class swapTwoNumbers {

    public static void swap(int a, int b){

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : ");
        System.out.println("First integer : " + a +"\n" + "Second integer : " + b);
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = in.nextInt();

        System.out.print("Enter second number : ");
        int b = in.nextInt();

        swap(a, b);

        in.close();


    }

}
