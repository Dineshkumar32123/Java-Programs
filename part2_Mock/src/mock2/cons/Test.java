package mock2.cons;

public class Test {
    // Java code for using this() to
// invoke current class constructor
        int a;
        int b;
        int c;

        // Default constructor
        Test()
        {
            this(10, 20,30);
            System.out.println("1st constructor");
        }

        // Parameterized constructor
        Test(int a, int b)
        {
            this.a = a;
            this.b = b;
            System.out.println("2nd constructor");
        }
    Test(int a, int b,int c)
    {
        this.a = a;
        this.b = b;
        this.c=c;
        System.out.println("3rd constructor");
    }

        public static void main(String[] args)
        {
            Test object =new Test();
        }

}
