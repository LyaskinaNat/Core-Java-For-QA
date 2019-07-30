# SECTION 2 : Storing data. Variables, Data Types, Operators and Literals
In order to store the data in Java programs, we need to use Variables, Data Types, operators and Literals.
## Variables
Variable is a name provided to a reserved a memory location.
There are two types of variables:
- Local Variables
A variable which is declared inside the method is called local variable
- Instance Variables
A variable which is declared inside the class but outside the method is called Instance variable

1. Delete Test.java class
2. Create a new class in src/main/java and name it VariableDemo
3. Include the following code:
```
public class VariableDemo {

    static int x = 10;  //Instance variable. It is declared inside the class but outside the methods. This variable can be accessed inside by every method inside the class

    public static void main(String args[]){

        System.out.println(x + " is printed from main() method"); //Printing out instance variable.
        // If uncommenting the below line of code, we can see a compiler error "Cannot resolve symbol 'y'"
        // Local variable 'y' from localVariable() method cannot be accessed from another method
        // System.out.println(y + " is printed from main() method");

        // Invoking class methods method(s)
        localVariable();
    }

    public static void localVariable() {
        int y = 15; //Local variable which is declared inside localVariable() method. This variable can only be accessed from localVariable() method
        System.out.println(x + " is printed from localVariable() method"); //Printing out instance variable.
        System.out.println(y + " is printed from localVariable() method"); // Printing out local variable.


    }
}
```
4. Run VariableDemo.main() and check the output in IDE console
5. Uncomment
```
System.out.println(y + " is printed from main() method");
```
in the main() method and check that the compiler error is shown

## Data Types
We can define variables with different Data types based on the type of data to be stored.

Note:  While working with Selenium, we only need int, double, char, boolean and String, so we will be focusing only on these data types
### int
Integer values can be stored into a variable which is declared with **int** data type
```
int i = 10;
```
### double
Decimal values can be stored into a variable which is declared with **double** data type
 ```
 double d = 6.73;
 ```
### char
Single character can be stored into a variable which is declared with **char** data type
```
char c = 's';
```
### boolean
true / false can be stored into a variable which is declared with **boolean** data type
```
 boolean b = true;
 ```
### String
Sequence of characters can be stored into a variable which is declared as **String**
 ```
 String s = "This is a sample string";
 ```
 1. Create a new static **method dataTypes()** and write the following code inside of it:
 ```
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
```
2. Invoke dataTypes() method from main() method
3. Run VariableDemo.main() and check the output

## Operators
Operators are just symbols used to perform operations on the provided data.
### Assignment Operators
1. Primitive Assignment
The equal (=) sign is used for assigning a value to a variable.
```
int a = 100;
```
2. Primitive Casting
Casting lets you convert primitive values from one type to another.
We need to provide casting when we are trying to assign higher precision primitive to lower precision primitive for example
If we try to assign int variable (which is in the range of byte variable) to byte variable then the compiler will throw an
exception called "possible loss of precision".
To avoid such problem we should use type casting which will instruct compiler for type conversion.
```
byte b = (byte) a;
```
Note: The actual value of higher precision primitive should be within precision of the low precision primitive.
Otherwise the value of the precision primitive will be assigned incorrectly
1. Create a new static method **primitiveCasting()** and write the following code inside of it:
```
public static void primitiveCasting() {
        int a = 100;
        byte b = (byte) a;
        System.out.println("assigning value of 'a' (int) to 'b' (byte),  b = " + b);
    }
```
2. Invoke primitiveCasting() method from main() method
3. Run VariableDemo.main() and check the output
4. Change the value of 'a' to 200 and run VariableDemo.main() again
5. Check that that value of 'b' is incorrect 9byt can only hold values in a range -128 to +127, value 200 is outside the range of 'b'

3. Compound Assignment Operators
Sometime we need to modify the same variable value and reassigned it to a same reference variable. We can do so using Compound Assignment Operators;
```
i +=8; //This is same as i = i+8;
```
The += is called the addition assignment operator. Other shorthand operators are shown below:
```
Operator  Name	                    Example	   Equivalent
+=	      Addition assignment	    i+=5;	   i=i+5
-=	      Subtraction assignment	j-=10;	   j=j-10;
*=	      Multiplication assignment	k*=2;	   k=k*2;
/=	      Division assignment	    x/=10;	   x=x/10;
%=	      Remainder assignment	    a%=4;	   a=a%4;
```
### Arithmetic Operators
We can use arithmetic operators to perform calculations with values in programs. Arithmetic operators are used in mathematical
expressions in the same way that they are used in algebra
```
int i = 20+5;
```
Arithmetic Operators are shown below:
```
Operator   Use	    Description	                                Example
+	       x + y	Adds x and y	                            float num = 23.4 + 1.6; // num=25
-	       x - y	Subtracts y from x	                        long n = 12.456 – 2.456; //n=10
-          -x	    Arithmetically negates x                    int i = 10; -i; // i = -10
*	       x * y	Multiplies x by y	                        int m = 10*2; // m=20
/	       x / y	Divides x by y	                            float div = 20/100 ; // div = 0.2
%	       x % y	Computes the remainder of dividing x by y	int rm = 20/3; // rm = 2
```
### Shortcut Arithmetic Operators (Increment and decrement operator)
The increment operator increases its operand by one. The decrement operator decreases its operand by one.
For example, this statement:
```
x = x + 1;
```
is equivalent to
```
x++;
```
Same way decrement operator
```
x = x - 1;
```
is equivalent to
```
x--;
```
These operators are unique in that they can appear both in postfix form, where they follow the operand as just shown,
and prefix form, where they precede the operand. In the foregoing examples, there is no difference between the prefix
and postfix forms. However, when the increment and/or decrement operators are part of a larger expression, then a subtle,
yet powerful, difference between these two forms appears. In the prefix form, the operand is incremented or decremented
before the value is obtained for use in the expression. In postfix form, the previous value is obtained for use in the expression,
and then the operand is modified.Let’s understand this concept with help of example below:

1. Create a new static method **ShortcutArithmeticOperatorsDemo()** and write the following code inside of it:
```
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
```
2. Invoke ShortcutArithmeticOperatorsDemo() method from main() method
3. Run VariableDemo.main() and check the output

### Conditional (Relational) Operators
If you need to change the execution of the program based on a certain condition.
The relational operators determine the relationship that one operand has to the other.
Specifically, they determine equality condition. Java provides six relational operators, which are listed below:
```
Operator  Description	             Example (a=10, b=15)   Result
==	      Equality operator	         a==b	                false
!=	      Not Equal to operator	     a!=b	                true
>	      Greater than	             a>b	                false
<	      Less than	                 a<b	                true
>=	      Greater than or equal to	 a>=b	                false
<=	      Less than or equal to	     a<=b                   true
```
The outcome of these operations is a boolean value. The relational operators are most frequently used in the expressions
that control the if statement and the various loop statements:
1. Create a new static method **conditionalOperators()** and write the following code inside of it:
```
    public static void conditionalOperators() {
        int a = 5;
        int b = 10;
        if (a>b) {
            System.out.println(a + " is grater than " + b);
        } else {
            System.out.println(b + " is grater than " + a);
        }
    }
    }
```
2. Invoke conditionalOperators() method from main() method
3. Run VariableDemo.main() and check the output
4. Make the value of 'a' greater than 'b' and run it again

### Ternary Operator (or ? Operator or Conditional Operator)
The conditional operator is a ternary operator (it has three operands) and is used to evaluate boolean expressions,
much like an if statement except instead of executing a block of code if the test is true,
a conditional operator will assign a value to a variable. A conditional operator starts with a boolean operation,
followed by two possible values for the variable to the left of the assignment (=) operator.
The first value (the one to the left of the colon) is assigned if the conditional (boolean) test is true,
and the second value is assigned if the conditional test is false.
In below example, if variable 'a' is less than 'b' then the variable 'x' value would be 50 else 60:
1. Create a new static method **ternaryOperator()** and write the following code inside of it:
```
    public static void ternaryOperator() {
        int a = 5;
        int b = 10;
        int x;
        x = (a>b) ? 50 : 60;
        System.out.println("value of 'x' is " + x);
    }
```
2. Invoke ternaryOperator() method from main() method
3. Run VariableDemo.main() and check the output
4. Make the value of 'a' greater than 'b' and run it again
## Logical Operators
### Short-Circuit Logical Operators
Java provides two other Boolean operators. These are secondary versions of the Boolean AND and OR operators
and are known as short-circuit logical operators. Two short-circuit logical operators are as follows:
```
&& short-circuit AND
|| short-circuit OR
```
They are used to link little boolean expressions together to form bigger boolean expressions.
The && and || operators evaluate only boolean values.
For an **AND (&&)** expression to be true,
BOTH operands must be true. For example, The below statement evaluates to true because of both operand
one (2 < 3) and operand two (3 < 4) evaluate to true.
```
if ((2 < 3) && (3 < 4)) { }
```
The short-circuit feature of the && operator is so named because it doesn't waste its time on pointless evaluations.
A short-circuit && evaluates the left side of the operation first (operand one), and if it resolves to false,
the && operator doesn't bother looking at the right side of the expression (operand two) since the && operator
already knows that the complete expression can't possibly be true.

**The || operator** is similar to the && operator, except that it evaluates to true if EITHER of the operands is true.
If the first operand in an OR operation is true, the result will be true, so the short-circuit || doesn't waste time looking
at the right side of the equation. If the first operand is false, however, the short-circuit || has to evaluate the second operand
to see if the result of the OR operation will be true or false.
### The NOT Operator
**The ! operator** is a logical NOT. It inverts the original value of a variable like so:
```
boolean x = true;
boolean y = !x;  // This will assign false value to 'y' as 'x' is true
```
