import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.Stack;

 

public class AdjacentCharacters {

    // Function to remove adjacent characters

    static String removeAdjacentRepeatedCharacters(String str){

        Stack<Character> stack = new Stack<>();

        int i;

        stack.push(str.charAt(0));

        for(i=1; i<str.length(); i++){

            if(stack.peek() == str.charAt(i)){

                stack.pop();

                continue;

            }

            stack.push(str.charAt(i));

        }

        StringBuffer obj = new StringBuffer();

        while(!stack.isEmpty()){

            obj.append(stack.pop());

        }

        return obj.reverse().toString();

    }

    // Function to read the input and display the output

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        System.out.println("Enter the string");

        try {

            str = br.readLine();

        } catch (IOException e) {

            System.out.println("An I/O error occurred");

            return;

        }

        String newString =removeAdjacentRepeatedCharacters(str);

        System.out.println("The new string is \"" + newString + "\"");

    }

}
