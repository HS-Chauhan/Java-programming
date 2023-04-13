    import java.util.Calendar;  
    public class JavaCalendar {  
       public static void main(String[] args) {  
          
          Calendar mycalobj =  Calendar.getInstance();  
          System.out.println("Today  :" + mycalobj.getTime());  
          System.out.println("Year  :" + mycalobj.get(Calendar.YEAR));  
          System.out.println("Month :" + mycalobj.get(Calendar.MONTH));  
          System.out.println("Day  :" + mycalobj.get(Calendar.DAY_OF_WEEK));  
             
          mycalobj.set(1996, 5, 23, 10, 15, 20);  
          System.out.println("Now Today  :" + mycalobj.getTime());  
          System.out.println(" Now Year  :" + mycalobj.get(Calendar.YEAR));  
          System.out.println("Now Month :" + mycalobj.get(Calendar.MONTH));  
          System.out.println("Now Day  :" + mycalobj.get(Calendar.DAY_OF_WEEK));  
       }  
    }  
