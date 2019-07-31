# SECTION 3 : Flow control
Flow Control describes the order in which statements will be executed at run time.
There are different types of flow control statements and can be categorised as below:
## Selection Statements
```
if
if ... else
if ... else if ... else
switch
```
Java has three types of selection statements.
- The 'if' statement either performs (selects) an action, if a condition is true, or skips it, if the condition is false.
- The 'if...else' statement performs an action if a condition is true and performs a different action if the condition is false.
- The switch statement performs one of many different actions, depending on the value of an expression.

### 'if ... else' statement
Following is the syntax of an if...else statement:
```
if(Boolean_expression) {
   // Executes when the Boolean expression is true
}else {
   // Executes when the Boolean expression is false
}
```
1. Delete VariableDemo.java class
2. Create a new class in src/main/java and name it FlowControlDemo
3. Include the following code:
```
public class FlowControlDemo {

    public static void main(String args[]){

        ifElseDemo();
    }

    public static void ifElseDemo() {
        int x = 10;
        if( x < 20 ) {
            System.out.println("This is if statement");
        } else {
            System.out.println("This is else statement");
        }
    }
}
```
4. Run FlowControlDemo.main() and check that 'if' statement was executed
5. Change 'x' value to 30, run it again and check that 'else' statement was executed
### 'switch' statement
Following is the syntax of a 'switch' statement:
```
switch (expression) {
case value1:
// statement sequence
break;
case value2:
// statement sequence
break;
….
case valueN:
// statement sequence
break;
default:
// default statement sequence
}
```
1. Create a new static method switchDemo() and write the following code inside of it:
```
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
```
2. Invoke switchDemo() method from main() method
3. Run FlowControlDemo.main() and check the output

## Iterative Statements
Iterative Statements helps us in executing the same block of code multiple times.
They executes the same set of code until the loop condition is satisfied
```
while
d-while
for
for-each
```
### 'while' loop
- The 'while' loop executes the same block of code multiple times i.e. until the boolean condition turns false.
- The 'while' loop tests the condition before executing the code in loop body
1. Create a new static method whileLoopDemo() and write the following code inside of it:
```
    public static void whileLoopDemo() {
            int i=0;
            while(i<3){
                System.out.println("This is a while loop iteration");
                i++;
            }
        }
```
2. Invoke whileLoopDemo() method from main() method
3. Run FlowControlDemo.main() and check the output
### 'do while' loop
- The 'do-while' loop works similar to while loop, but the block of code will be executed at least once (event if condition is false)
 as it checks condition after the execution
1. Create a new static method doWhileLoopDemo() and write the following code inside of it:
 ```
     public static void doWhileLoopDemo() {
             int i=4;
             do {
                 System.out.println("4 is grater than 3 but the statement was executed");
                 i++;
             } while(i<3);
         }
 ```
2. Invoke doWhileLoopDemo() method from main() method
3. Run FlowControlDemo.main() and check the output
 ### 'for' loop
- The 'for loop' is the most commonly used loop in Java and is used when we know the number of iterations in advance.
- The 'for' loop executes the same block of code multiple times, until the boolean condition turns false.
- Though while loop and for loop work in the similar manner, while loop is preferred over for loop when we don't know the number of iterations in advance
1. Create a new static method forLoopDemo() and write the following code inside of it:
 ```
     public  static void forLoopDemo() {
             for(int i=0;i<3;i++){
                 System.out.println("This is a for loop iteration");
             }
 ```
2. Invoke forLoopDemo() method from main() method
3. Run FlowControlDemo.main() and check the output
### 'for-each' loop
The 'for-each' loop is generally used with Arrays and Collections.
The syntax of Java for-each loop consists of data type with the variable followed by a colon (:), then array or collection:
```
for(data_type variable : array | collection){
//body of for-each loop
}
```
The Java for-each loop traverses the array or collection until the last element. For each element, it stores the element in
the variable and executes the body of the for-each loop.
1. Create a new static method forEachLoopDemo() and write the following code inside of it:
 ```
    public  static void forEachLoopDemo() {
        //declaring an array
        int arr[]={10,20,30,40};
        //traversing the array with for-each loop
        for(int i:arr){
            System.out.println(i);
        }
    }
 ```
2. Invoke forEachLoopDemo() method from main() method
3. Run FlowControlDemo.main() and check the output
## Transfer Statements
Transfer statements are used to transfer the flow of execution from one block of code to a different block of code.
Different types of Transfer Statements:
```
break
continue
return
try, catch, finally
```
### break;
The purpose of the 'break' statement is to come out of the statements based on some condition
1. Create a new static method breakStatementDemo() and write the following code inside of it:
 ```
     public  static void breakStatementDemo() {
             for(int i=0;i<5;i++){
                 if(i==2)
                     break;
                 System.out.println("This is a break statement-" + i);
             }
         }
 ```
2. Invoke breakStatementDemo() method from main() method
3. Run FlowControlDemo.main() and check the output
### continue;
The purpose of the 'continue' statement is to skip the current iteration of a loop based on some condition and continue with the next iteration.
1. Create a new static method continueStatementDemo() and write the following code inside of it:
 ```
     public  static void continueStatementDemo() {
             for(int i=0;i<5;i++){
                 if(i==2)
                     continue;
                 System.out.println("This is a continue statement-" + i);
             }
         }
 ```
2. Invoke continueStatementDemo() method from main() method
3. Run FlowControlDemo.main() and check the output
### return
The purpose of the 'return' statement is to exit from a method, with or without a value

**Methods returning a value :**

For methods that define a return type, return statement must be immediately followed by return value.
1. Create a new static method returnStatementWithValueDemo() and write the following code inside of it:
 ```
    public  static int returnStatementWithValueDemo() {
            int a = 10;
            int b = 20;
            int sum = a + b;
            return sum;
        }
 ```
2. Invoke returnStatementWithValueDemo() method from main() method like so:
```
int valueReturnedByMethod = returnStatementWithValueDemo();
System.out.println("Printing returned value of returnStatementWithValueDemo() method in main: " + valueReturnedByMethod);
```
**Explanation:**

When we call returnStatementWithValueDemo() method that has 'return sum' which returns the value of sum and
that’s value gets displayed on the console.

3. Run FlowControlDemo.main() and check the output

**Methods not returning a value :**

For methods that don’t return a value, return statement can be skipped.
Check all our 'void' methods - we do not use 'return' statement in them to come out of them. But sometimes we need to explicitly tell to the program
to come out of the method if a certain condition is present.
1. Create a new static method returnStatementNoValueDemo() and write the following code inside of it:
 ```
    public  static void returnStatementNoValueDemo() {
            int i = 1;
            if(i < 2)
            return;
            System.out.println("Condition to return from the statement was not met, therefore this statement was executed");
        }
 ```
2. Invoke returnStatementNoValueDemo() method from main() method
3. Run FlowControlDemo.main() and check the output

**Explanation:**

If the statement 'if(i < 2)'' is true then control exits from the method and does not execute the rest of the statement
of the method and hence come back again to main method.

4. Change the value of 'i' to 3 and run it again and check that the rest of the statement was executed this time
### try, catch, finally
A method catches an exception using a combination of the try and catch keywords. The **'try/catch'** block is placed around
the code that might generate an exception. This prevents avoid crashing the program. Code within a try/catch block is
referred to as protected code, and the syntax for using try/catch looks like the following:
```
try {
   // Protected code
} catch (ExceptionName e) {
   // Catch block
}
```
The **'finally'** block follows a try block or a catch block. The 'finally' block of code is always executed, irrespective of occurrence of an Exception.
Using the finally block allows us to run any cleanup-type statements that we want to execute, no matter what happens in the protected code.
```
try {
   // Protected code
} catch (ExceptionType1 e1) {
   // Catch block

}finally {
   // The finally block always executes.
}
```
1. Create a new static method tryCatchFinallyDemo( and write the following code inside of it:
 ```
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
 ```
2. Invoke tryCatchFinallyDemo( method from main() method
3. Run FlowControlDemo.main() and check the output - catch block was executed due to ArithmeticException being thrown.
Program did'n crash and 'finally' block was executed successfully
4. Change the value of 'b' to 1 and run it again. check that 'try' block was executed this time and 'finally' block as well.