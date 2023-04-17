import java.util.*;
import java.beans.*;
import java.awt.*;

public class AddorSub {

    void addition(int a, int b){
        System.out.println("Addition of A and B is : " + (a + b));
    }

    void subtraction(int a, int b){
        System.out.println("Subtraction of A and B is : " + (a - b));
    }

    public static void main(String[] args) {
        AddorSub obj = new AddorSub();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of A : ");
        int a = in.nextInt();
        System.out.println("Enter the value of B : ");
        int b = in.nextInt();

        System.out.println("Addition of the two numbers is : ");
        obj.addition(a, b);

        System.out.println("Subtraction of the two numbers is : ");
        obj.subtraction(a, b);
    }

}
