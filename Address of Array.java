import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

 

public class ArrayAddress {


    public static void main(String args[])throws IOException

    {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        long size_of_element,base_address,index;

        System.out.println("Enter the base address of the array(>=0)");

        try{

            base_address=Long.parseLong(br.readLine());

        }

        catch(Exception e){

            System.out.println("Invalid Base Address");

            return;

        }

        System.out.println("Enter the size of the array element in bytes(>0)");

        try{

            size_of_element=Long.parseLong(br.readLine());

        }

        catch(Exception e){

            System.out.println("Invalid Size");

            return;

        }

        System.out.println("Enter the index of the element(>=0)");

        try{

            index=Long.parseLong(br.readLine());

        }

        catch(Exception e){

            System.out.println("Invalid Index");

            return;

        }

        if( base_address < 0 || size_of_element <=0 || index < 0 ){

            System.out.println("Invalid Input");

        }

        long element_Address;

        element_Address = base_address + (size_of_element * index);

        System.out.println("The address of the element at index "+ index

                                                 +" is "+element_Address);

    }

}
