import java.util.*;
public class CompoundInterest {
   public static void main (String args[]){
     
     
      double principle, rate, time, compound_interest;
     
      Scanner my_scanner = new Scanner(System.in);
     
      System.out.print("Enter a Principle number : ");
      principle = my_scanner.nextInt();
      System.out.print("Enter Interest rate : ");
      rate = my_scanner.nextInt();
      System.out.print("Enter a Time period in years : ");
      time = my_scanner.nextInt();
      compound_interest = principle * (Math.pow((1 + rate / 100), time)) - principle;
      System.out.println("The Compound Interest is : " + compound_interest);
   }
}
