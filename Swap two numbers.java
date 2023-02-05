import java.util.*;

public class swapTwoNumbers {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of 1st integer is : " + a + "\nValue of 2nd integer is : " + b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        swap(num1,num2);

        

    }
}
