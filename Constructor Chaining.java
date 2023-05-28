public class ConstructorChaining
{
    ConstructorChaining()
    {
        this(20);
        System.out.println("Default constructor of class.");
    }
    ConstructorChaining(int x)
    {
        System.out.println("Parameterized (1 parameter) constructor of class.");
        System.out.println("The value of x is "+x);
    }
    ConstructorChaining(int x, int y)
    {
        this();
        System.out.println("Parameterized (2 parameters) constructor of class.");
        System.out.println("The  value of x and y is  " + x + "and " + y + ". " 
                            + "The sum of x and y is " + (x + y) );
    }
    public static void main(String... a)
    {
        ConstructorChaining(11,12);
    }
}
