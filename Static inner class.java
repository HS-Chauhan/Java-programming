    public class Outer 

    {

        int x = 10;

        static int y = 20;

        static class Inner 			

        {

            void show()		        

            {

                System.out.println(y);


            }

        }

        public static  void main(String... s)

        {

            System.out.println("'In main method'. The vlaue of static data member of outer class is :"+y);


            System.out.println("Inner class method accessed by Inner class object ");

            Inner i = new Inner();

            i.show();

            System.out.println("Inner class method accessed by outer class object ");

            Outer.Inner o = new Outer.Inner();

            o.show();

        }

    }
