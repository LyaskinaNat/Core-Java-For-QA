public class VariableDemo {

    static int x = 10;  //Instance variable. It is declared inside the class but outside the methods. This variable can be accessed inside by every method inside the class

    public static void main(String args[]){

        System.out.println(x + " is printed from main() method"); //Printing out instance variable.
        // If uncommenting the below line of code, we can see a compiler error "Cannot resolve symbol 'y'"
        // Local variable 'y' from localVariable() method cannot be accessed from another method
        // System.out.println(y + " is printed from main() method");

        // Invoking class methods method(s)
        localVariable();
        dataTypes();
        primitiveCasting();
        ShortcutArithmeticOperatorsDemo();
        conditionalOperators();
        ternaryOperator();
    }

    public static void localVariable() {
        int y = 15; //Local variable which is declared inside localVariable() method. This variable can only be accessed from localVariable() method
        System.out.println(x + " is printed from localVariable() method"); //Printing out instance variable.
        System.out.println(y + " is printed from localVariable() method"); // Printing out local variable.


    }

    public static void dataTypes() {
        int i = 10;
        double d = 6.73;
        char c = 's';
        boolean b = true;
        String s = "This is a sample string";

        System.out.println("int value is " + i);
        System.out.println("double value is " + d);
        System.out.println("char value is " + c);
        System.out.println("boolean value is " + b);
        System.out.println("String value is " + s);
    }

    public static void primitiveCasting() {
        int a = 100;
        byte b = (byte) a;
        System.out.println("assigning value of 'a' (int) to 'b' (byte),  b = " + b);
    }

    public static void ShortcutArithmeticOperatorsDemo() {
        int a,b,c,d;
        a=b=c=d=100;

        int p = a++;
        int r = c--;
        int q = ++b;
        int s = --d;
        System.out.println("prefix increment operator result= "+ p + " and Value of a= "+ a);
        System.out.println("prefix decrement operator result= "+ r + " and Value of c= "+c);
        System.out.println("postfix increment operator result= "+ q + " and Value of b= "+ b);
        System.out.println("postfix decrement operator result= "+ s + " and Value of d= "+d);
    }

    public static void conditionalOperators() {
        int a = 5;
        int b = 10;
        if (a>b) {
            System.out.println(a + " is grater than " + b);
        } else {
            System.out.println(b + " is grater than " + a);
        }
    }

    public static void ternaryOperator() {
        int a = 5;
        int b = 10;
        int x;
        x = (a>b) ? 50 : 60;
        System.out.println("value of 'x' is " + x);
    }
}
