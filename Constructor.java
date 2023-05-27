public class Constructor
{
    double width;
    double height;
    double depth;
    Constructor() 
    {
	System.out.println("Constructor without parameter");
	width = 10;
	height = 10;
	depth = 10;
    }
    Constructor(int a, int b, int c) 
    {
	System.out.println("Constructor with parameter");
	width = a;
	height = b;
	depth = c;
    }
    double volume() 
    {
	return width * height * depth;
    }
}
class Constructor2
{
    public static void main(String args[]) 
    {
	Constructor cuboid1 = new Constructor();
        double vol;
	vol = cuboid1.volume();
	System.out.println("Volume is " + vol);
	Constructor cuboid2 = new Constructor(8,11,9);
	vol = cuboid2.volume();
	System.out.println("Volume is " + vol);
    }
}
