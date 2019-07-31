public class FlowControlDemo {

    public static void main(String args[]){

        ifElseDemo();
        switchDemo();
        whileLoopDemo();
        doWhileLoopDemo();
        forLoopDemo();
        forEachLoopDemo();
        breakStatementDemo();
        continueStatementDemo();
        int valueReturnedByMethod = returnStatementWithValueDemo();
        System.out.println("Printing returned value of returnStatementWithValueDemo() method in main: " + valueReturnedByMethod);
        returnStatementNoValueDemo();
        tryCatchFinallyDemo();

    }

    public static void ifElseDemo() {
        int x = 10;
        if( x < 20 ) {
            System.out.println("This is if statement");
        } else {
            System.out.println("This is else statement");
        }
    }

    public static void switchDemo() {
        char Grade ='B';
        switch (Grade){
            case 'A':
                System.out.println("Your grade is A");
                break;
            case 'B':
                System.out.println("Your grade is B");
                break;
            case 'C':
                System.out.println("Your grade is C");
                break;
            default:
                System.out.println("Your grade is undefined");
                break;
        }
    }

    public static void whileLoopDemo() {
        int i=0;
        while(i<3){
            System.out.println("This is a while loop iteration");
            i++;
        }
    }

    public static void doWhileLoopDemo() {
        int i=4;
        do {
            System.out.println("4 is grater than 3 but the statement was executed");
            i++;
        } while(i<3);
    }

    public  static void forLoopDemo() {
        for(int i=0;i<3;i++){
            System.out.println("This is a for loop iteration");
        }
    }

    public  static void forEachLoopDemo() {
        //declaring an array
        int arr[]={10,20,30,40};
        //traversing the array with for-each loop
        for(int i:arr){
            System.out.println(i);
        }
    }

    public  static void breakStatementDemo() {
        for(int i=0;i<5;i++){
            if(i==2)
                break;
            System.out.println("This is a break statement-" + i);
        }
    }

    public  static void continueStatementDemo() {
        for(int i=0;i<5;i++){
            if(i==2)
                continue;
            System.out.println("This is a continue statement-" + i);
        }
    }

    public  static int returnStatementWithValueDemo() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;
    }

    public  static void returnStatementNoValueDemo() {
        int i = 1;
        if(i < 2)
        return;
        System.out.println("Condition to return from the statement was not met, therefore this statement was executed");
    }

    public  static void tryCatchFinallyDemo() {
        try {
                int a = 5;
                int b = 0;
                int result = a / b;
                System.out.println("Result: " + result);
        } catch(ArithmeticException e){
                System.out.println("Exception: " + e);
            } finally{
                System.out.println("This is a 'finally' statement execution");
            }
    }


}
