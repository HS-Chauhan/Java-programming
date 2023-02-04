import java.util.Scanner;

public class NestedSwitch  {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your id : ");
        int empId = in.nextInt();



        switch (empId){
            case 1 -> System.out.println("Harshvardhan");
            case 2 -> System.out.println("Harshvardhan Singh Chauhan");
            case 3 ->{
                System.out.println("Emp number 3");
                System.out.print("Enter your department : ");
                String department = in.next();
                switch(department){
                    case "IT" -> System.out.println("IT Department");
                    case "Management", "management" -> System.out.println("Management department");
                    case "Worker", "worker" -> System.out.println("Sanitation worker");
                    default -> System.out.println("Wrong department");
                }
            }
            default -> System.out.println("No employee found");
        }
    }
}
