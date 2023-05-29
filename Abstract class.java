    abstract class Calculation

    {

        float a = 12, b = 6, c;

        abstract void add();

        void subtract()

        {

            c = a - b;

            System.out.println("Result:"+c);

        }

        abstract void multiply();

        void divide()

        {

            c = a / b;

            System.out.println("Result:"+c);

        }

    }

    public class AbstractionDemo extends Calculation

    {

        void add()

        {

            c = a + b;

            System.out.println("Result:"+c);

        }

        void multiply()

        {

            c = a * b;

            System.out.println("Result:"+c);

        }

        public static void main(String[] args)

        {

            AbstractionDemo obj = new AbstractionDemo;

            obj.add();

            obj.subtract();

            obj.multiply();

            obj.divide();

        }

    }
