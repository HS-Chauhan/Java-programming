import java.util.*;
  
class Tantable {
  
    
    public static void main(String args[])
    {
  
        double degrees = 45.0;
  
        
        double radians = Math.toRadians(degrees);
  
        
        double tanValue = Math.tan(radians);
  
        
        System.out.println("tan(" + degrees + ") = " + tanValue);
    }
}
