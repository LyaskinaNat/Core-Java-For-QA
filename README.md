# Introduction
This is Core Java tutorial for test automation QA engineers
Prerequisites:
Java is is installed and set up
Maven is installed and set up
IDE is installed (Eclipse or IntelliJ)
Basic knowledge on how to create Maven (Java) empty project in IntelliJ IDE

Note: The Project for this tutorial was written using IntelliJ IDE

# SECTION 1 : Introduction to Java
## Creating first Maven (Java) project
1. Create a new Maven project
2. Create a new Java class: right click on  src/main/java > new java class and name it Test
3. Insert the following code;
```
public class Test {
    public static void main(String args[]){
        System.out.println("Hello World!");
    }
}
```
4. Run the program either by
- top menu > run > run 'Test'
or
- right click on Test.java > Run Test.main()
5. Check the output in the IDE console:
```
Hello World!
```
## Understanding Java Programs. Overview of Syntax
- In Java programs we have to enclose everything inside a Class.

Syntax:
```
public class ClassName { }
```
- In Java programs, execution starts from the main method

Syntax of main() method:
```
public static void main(String args[]){ }
```
- All the Java statements in Java should end with ';' symbol

Java statement example:
```
System.out.println("Hello World");
```
- All the Java statements should be written inside the methods

- Compiler Errors:

Java Compiler Errors will be displayed when we make syntax mistakes in the Java Code. Compiler errors are
visible during code writing

- Comments provided in a Java program won't be executed and are generally used to explain the underlined code.
Syntax:
a) Single line comment
```
// This is a comment
```
b) Multi line comment
```
/* Line one comment
line two comment */
```










