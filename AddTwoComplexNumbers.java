import java.io.BufferedReader;

import java.io.InputStreamReader;

 

public class ComplexNumbers {

   

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double i1,j1,i2,j2;

        System.out.println("Enter the real part and

                            imaginary part of the first complex number");

        try{

            i1=Double.parseDouble(br.readLine());

            j1=Double.parseDouble(br.readLine());

        }catch (Exception e){

            System.out.println("An error occurred");

            return;

        }

        System.out.println("Enter the real part and

                            imaginary part of the second complex number");

        try{

            i2=Double.parseDouble(br.readLine());

            j2=Double.parseDouble(br.readLine());

        }catch (Exception e){

            System.out.println("An error occurred");

            return;

        }

        System.out.println("The first complex number is "

                            + i1 + " + i(" + j1 + ")");

        System.out.println("The second complex number is "

                            + i2 + " + i(" + j2 + ")");

        System.out.println("The sum of the two complex numbers is "

                            + (i1 + i2) + " + i(" + (j1 + j2) + ")");

    }

}
