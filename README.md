# JavaBasics
The provided Java code is a complete program that demonstrates various concepts and features of the Java programming language. Let's go through the code and explain each section in detail.

1. Import Statements:
```java
import java.util.Arrays;
import java.util.Scanner;
```
These statements import necessary classes from the Java standard library. `Arrays` is used for array manipulation, and `Scanner` is used for user input.

2. Class Definition:
```java
public class Main {
    ...
}
```
The code defines a public class named `Main`. This class contains the main entry point of the program.

3. Method Definitions:
```java
public static void printUday(){
    System.out.println("Uday");
}

public static void printName(String name){
    System.out.println(name);
}

public static void Sum(int a, int b) {
    System.out.println(a+b);
}
```
These methods are defined within the `Main` class. 
- `printUday()` prints the string "Uday".
- `printName(String name)` prints the provided name.
- `Sum(int a, int b)` calculates the sum of two integers and prints the result.

4. Main Method:
```java
public static void main(String[] args) {
    ...
}
```
The `main` method is the entry point of the program. It is executed when the program starts.

5. Output Statements:
```java
System.out.println("Hello and welcome!");
System.out.print("print without ln");
```
These statements print messages to the console. `println` adds a newline character after the message, while `print` does not.

6. Variable Declaration and Initialization:
```java
String name = "Uday";
String name4  = "Hemant";
int age = 30;
```
Variables are declared and initialized. `name` and `name4` are strings, and `age` is an integer.

7. Variable Usage and String Manipulation:
```java
System.out.println("\n" + name);
String same = name;
System.out.println(same);
```
The value of `name` is printed, and then assigned to the variable `same` and printed again.

8. Data Types:
```java
byte num = 3;
int phone = 950180387;
long phone2 = 9501803878L;
float pi = 3.14f;
char letter  = 'b';
boolean isAdult = true;
```
These lines demonstrate different primitive data types in Java: `byte`, `int`, `long`, `float`, `char`, and `boolean`. Each variable is declared and assigned a value of the corresponding data type.

9. String Manipulation:
```java
String line = "Sangeeta verma";
String f = new String("Lavi");
System.out.println(line.length());
```
A string `line` is declared and assigned a value. The `length()` method is called to retrieve the length of the string.

10. String Concatenation:
```java
String name1 = "Uday";
String name2 = " Verma";
String name3 = name1 + name2;
System.out.println(name3);
```
String concatenation is performed by using the `+` operator. The resulting string is printed.

11. String Methods:
```java
System.out.println(name.charAt(0));
System.out.println(name.length());
String name5 = name.replace('a','e');
System.out.println(name5);
System.out.println(name);
System.out.println(line.substring(0,4));
```
These statements demonstrate various string methods:
- `charAt(index)` retrieves the character at the specified index.
- `length()` returns the length of the string.
- `replace(oldChar

, newChar)` replaces occurrences of `oldChar` with `newChar`.
- `substring(startIndex, endIndex)` extracts a substring from the original string.
Note that strings are immutable in Java, so operations like `replace` and `substring` return new strings.

12. Arrays:
```java
int[] marks = new int[4];
marks[0] = 56;
marks[1] = 96;
marks[2] = 59;
```
An integer array `marks` is declared and initialized. Values are assigned to specific indices.

13. Array Manipulation:
```java
System.out.println(marks[0]);
System.out.println(marks[1]);
System.out.println(marks[2]);
System.out.println(marks[3]);
System.out.println(marks.length);
Arrays.sort(marks);
System.out.println(marks[1]);
```
These statements demonstrate various array operations:
- Elements of the array are accessed and printed using index notation.
- The `length` property is used to determine the length of the array.
- The `sort` method from the `Arrays` class is used to sort the array in ascending order.

14. Multi-dimensional Arrays:
```java
int[][] finalMarks = {{96,56,85} , {85,74,45}};
System.out.println(finalMarks[0][0]);
System.out.println(finalMarks[1][1]);
```
A two-dimensional array `finalMarks` is declared and initialized with values. Elements are accessed using row and column indices.

15. Casting:
```java
double price = 100.00;
double finalPrice = price + 18;
int p =100;
int fP = p + (int)18.0;
```
Casting is used to convert data between different types. In this case, the double value `18.0` is explicitly cast to an integer before performing addition.

16. Constants:
```java
final float PI = 3.14F;
```
A constant `PI` is declared using the `final` keyword. Its value cannot be changed once assigned.

17. Arithmetic and Assignment Operators:
```java
int a = 1;
int b = 6;
int sum = a+b;
int diff = a-b;
int mul = a*b;
int div = a/b;
int modulo = a%b;
int c= 10;
int d = 11;
d++;
++d;
--d;
d--;
```
These statements demonstrate various arithmetic and assignment operators, such as addition, subtraction, multiplication, division, modulus, and increment/decrement.

18. Math Class:
```java
System.out.println(Math.max(5,8));
System.out.println(Math.min(5,8));
System.out.println(Math.random());
```
The `Math` class provides mathematical functions. Here, `max` and `min` methods find the maximum and minimum of two numbers, and `random` generates a random number between 0.0 and 1.0.

19. User Input:
```java
Scanner sc = new Scanner(System.in);
int num5 = sc.nextInt();
float num6 = sc.nextFloat();
String name6 = sc.next();
sc.nextLine();
String line2 = sc.nextLine();
```
A `Scanner` object is created to read user input from the console. `nextInt`, `nextFloat`, `next`, and `nextLine` methods are used to read integers, floats, strings (without whitespaces), and lines (including whitespaces) respectively.

20. Conditional Statements:
```java
if (isSunUp == true)
    System.out.println("Day");
else
    System.out.println("Night");
```
An `if-else` statement checks the value of `isSunUp`

 and prints the corresponding message.

21. Logical Operators:
```java
int e = 30;
int g = 40;
if(e>50 && g<50)
    System.out.println("If true AND ");
if(e>50 || g<50)
    System.out.println("If true OR");
```
Logical operators `&&` (AND) and `||` (OR) are used to combine conditions in `if` statements.

22. Conditional Statements with User Input:
```java
System.out.println("Enter your cash");
int cash = sc.nextInt();
if (cash < 10) {
    System.out.println("cannot buy anything");
    System.out.println("get more cash");
}
else if (cash > 10 && cash < 50) {
    System.out.println("can get 1 thing");
}
else {
    System.out.println("You can get both");
}
```
A user enters the amount of cash they have, and based on the value, different messages are printed using `if-else` statements.

23. Switch Case:
```java
int day = sc.nextInt();
switch (day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    // ... cases for other days
    default:
        System.out.println("Wrong day");
}
```
A user enters a number representing a day, and the corresponding day is printed using a `switch` statement.

24. Loops:
```java
for(int i = 1; i<=100 ; i++){
    System.out.println(i);
}

int i = 99;
while(i >= 1){
    System.out.println(i);
    i--;
}

int j = 36;
do{
    System.out.println(j);
    j = j/6;
} while(j >= 1);

int k = 0;
while(true){
    System.out.println(k);
    k++;
    if(k>5){
        break;
    }
}
```
Different types of loops are used here: `for`, `while`, and `do-while`. These loops iterate over a range of numbers or conditionally execute a block of code until a specified condition is met.

25. Break and Continue:
```java
int z = 0;
while(true){
    if(z==5){
        z++;
        continue;
    }
    System.out.println(z);
    z++;
    if(z>10){
        break;
    }
}
```
The `break` statement is used to exit the loop prematurely, and the `continue` statement is used to skip the current iteration and continue with the next iteration.

26. Exception Handling:
```java
int[] number = {65,52,58};
try{
    System.out.println(marks[5]);
} catch(Exception exception){
    // do something if want to
}
System.out.println("After try/catch");
```
The code within the `try` block is executed, and if an exception occurs, it is caught by the `catch` block. Any desired actions can be taken within the `catch` block. The program continues execution after the `catch` block.

27. Methods/Functions:
```java
public static void printUday(){
    System.out.println("Uday");
}

public static void printName(String name){
    System.out.println(name);
}

public static void Sum(int a, int b) {
    System.out.println(a+b);
}
```
These are examples of defining and calling methods/functions. `printUday` prints the string "Uday", `printName` prints the input name, and `Sum` calculates and prints the sum of two integers.

28. Guessing Game:
```java
int myNum =

 (int)(Math.random() * 100);
int userNum;
do{
    userNum = sc.nextInt();
    if(userNum > myNum)
        System.out.println("Guess lower");
    else if(userNum < myNum)
        System.out.println("Guess higher");
    else
        System.out.println("Congratulations, you guessed it!");
} while(userNum != myNum);
```
A random number is generated, and the user tries to guess it. The program provides hints to the user based on their guesses, and continues until the correct number is guessed.

29. File Input/Output:
```java
try{
    File myFile = new File("filename.txt");
    Scanner fileReader = new Scanner(myFile);
    while(fileReader.hasNextLine()){
        String line = fileReader.nextLine();
        System.out.println(line);
    }
    fileReader.close();
} catch(Exception exception){
    exception.printStackTrace();
}
```
This code reads the contents of a file named "filename.txt" and prints each line. It utilizes the `File` and `Scanner` classes for file handling. Any exceptions that occur during the file reading process are caught and printed.

This is a comprehensive overview of the provided Java code. It covers a wide range of concepts, including variables, data types, strings, arrays, loops, conditional statements, methods, user input, file I/O, and more.

