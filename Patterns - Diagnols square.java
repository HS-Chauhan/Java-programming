import java.util.*;

public class charPattern {

    public static void main(String[] args) {
        char j = 'A';

        System.out.println("Enter your value : ");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();


        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= i; k++) {
                char s = (char) (j + k);
                System.out.print(s + " ");
            }
            for(int x=2*(n-1);x>2*i;x--){
                System.out.print("* ");
            }
            for(int k=0;k<=i;k++){
                char s = (char)(j+i-k);
                System.out.print(s+" ");
            }
            System.out.println();
        }
        
        for (int i = n - 1; i > 0; i--) {

            for (int k = 0; k < i; k++) {
                char s = (char) (j + k);
                System.out.print(s + " ");
            }
            for(int x=2*(n-i);x>0;x--){
                System.out.print("* ");
            }

            for(int k=i-1;k>=0;k--){
                char s = (char)(j+k);
                System.out.print(s+" ");
            }
            System.out.println();
        }


    }
}



