
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void printUday(){
        System.out.println("Uday");
    }
    public static void printName(String name){
        System.out.println(name);
    }

    public static void Sum(int a, int b) {
        System.out.println(a+b);
    }
    public static void main(String[] args) { //main functions

        System.out.println("Hello and welcome!");
        System.out.print("print without ln");

        //variable
        String name = "Uday";
        String name4  = "Hemant";
        int age = 30;
        System.out.println("\n" + name);

        String same = name;
        System.out.println(same);
        //Types - primitive and non primitive
        //PRIMITIVE
        //byte = 1 [-128 to 127]
        //short - 2
        //int - 4
        //float - 4
        //double - 8
        //char -2
        //boolean - 1

        byte num = 3;
        int phone = 950180387;
        long phone2 = 9501803878L;
        float pi = 3.14f;
        char letter  = 'b';
        boolean isAdult = true;

        //NON - PRIMITIVE
        String line = "Sangeeta verma";
        String f = new String("Lavi");
        System.out.println(line.length());
        //Strings
        // concatenation
        String name1 = "Uday";
        String name2 = " Verma";
        String name3 = name1 + name2;
        System.out.println(name3);

        //charAt
        System.out.println(name.charAt(0)); // What is present at index ()
        //length
        System.out.println(name.length());
        //replace
        String name5 = name.replace('a','e');
        System.out.println(name5);
        System.out.println(name); //original string not changed, immutable

        //Substring
        System.out.println(line.substring(0,4)); // 4 is not included

        //Arrays
        int age2 = 30;
        int[] marks = new int[4];
        marks[0] = 56;
        marks[1] = 96;
        marks[2] = 59;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // by default value in java is 0
        System.out.println(marks[3]); // 0 output because not initialized

        // length
        System.out.println(marks.length); // () not in use because it is a property not function
        //sort
        System.out.println(marks[1]); //Before sort
        Arrays.sort(marks);
        System.out.println(marks[1]); // after sort

        int[] marks2 = {98,25,63,48,45};

        int[][] finalMarks = {{96,56,85} , {85,74,45}};

        System.out.println(finalMarks[0][0]); // first student and first suject
        System.out.println(finalMarks[1][1]);

        //casting
        double price = 100.00;
        double finalPrice = price + 18; // implicit casting

        System.out.println(finalPrice);

        int p =100;
        //int fP = p + 18.0;  error
        int fP = p + (int)18.0;
        System.out.println(fP);

        //constants
         //float PI = 3.14F; can be changed
        final float PI = 3.14F; // now cannot be changed

        //operators
        int a =1;
        int b = 6;
        // Arthematic operators
        int sum = a+b;
        System.out.println(sum);

        int diff = a-b;
        System.out.println(diff);

        int mul = a*b;
        System.out.println(mul);

        int div = a/b;
        System.out.println(div);

        int modulo = a%b;
        System.out.println(modulo);

        //Assignment operator
        int c= 10; // = is an assignment operator

        int d = 11;
       // d++;
        System.out.println(d++);
        System.out.println(d);
        //++d;
        System.out.println(++d);
        System.out.println(d);
        // --d
        System.out.println(--d);
        System.out.println(d);
        // d--
        System.out.println(d--);
        System.out.println(d);

        // Maths class
        // 5 , 8
        System.out.println(Math.max(5,8));
        System.out.println(Math.min(5,8));
        System.out.println(Math.random()); // 0.0 - 1.0

        // User input

        Scanner sc = new Scanner(System.in);
        System.out.println("Input any number: ");
        int num5 = sc.nextInt();
        System.out.println(num5);

        System.out.println("Input any number(float): ");
        float num6 = sc.nextFloat();
        System.out.println(num6);

        System.out.println("Input your name: ");
        String name6 = sc.next(); // no whitespace consideration
        System.out.println(name6);

        sc.nextLine(); //By calling sc.nextLine() before the actual input line,
                        // it consumes the newline character left in the input buffer, allowing you to enter your desired input without being skipped.

        System.out.println("Input your line: ");
        String line2 = sc.nextLine(); //  whitespace consideration
        System.out.println(line2);

        //Comparison operators
        // a == b
        // a != b
        // a < b
        // a > b
        // a <= b
        // a >= b

        //Conditional statements
        boolean isSunUp = true;
        if (isSunUp == true) // can also write isSunUp works only true
            System.out.println("Day");
        else
            System.out.println("Night");

        //logical operators
        // && - And
        int e = 30 ;
        int g = 40;

        if(e>50 && g<50)
            System.out.println("If true AND ");

        if(e>50 || g<50)
            System.out.println("If true OR");

        System.out.println("Enter your cash");
        int cash = sc.nextInt();
        // pen = 10 , notebook = 40
        if (cash < 10) {
            System.out.println("cannot buy anything");
            System.out.println("get more cash");
        }
        else if (cash > 10 && cash < 50) {
            System. out .println("can get 1 thing");
        }

        else {
            System.out.println("You can get both");
        }

        ///Switch case

        System.out.println("Enter the day");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day");

        }

        //Loops
        for(int i = 1; i<=100 ; i++){
            System.out.println(i);
        }

        int i = 99;
        while(i >= 1){
            System.out.println(i);
            i--;
        }
        System.out.println("\n");
        int j = 36;
        do{
            System.out.println(j);
            j = j/6;
        }while(j >= 1);
        System.out.println("\n");
        int k =0;
        // Break and continue
        while(true){
            System.out.println(k);
            k++;
            if(k>5){
                break;
            }
        }
        System.out.println("\n");
        int z =0;
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

        //Exception handling
        // Try and catch
        int[] number = {65,52,58};
        try{
            System.out.println(marks[5]);
        } catch(Exception exception){
           // do something if want to
        }
        System.out.println("After try/catch");

        //Method/ Function

        printUday();
        printName("Hemant");
        Sum(1,6);


        int myNum = (int)(Math.random()*100);
        int userNum =0;
        do{
            System.out.println("Guess the number: ");
            userNum  = sc.nextInt();

            if(userNum== myNum){
                System.out.println("You are correct");
            }
            else if(userNum > myNum){
                System.out.println("Number is too high");
            }
            else {
                System.out.println("Number too low");
            }
        }while(userNum >= 0 && userNum != myNum);
        System.out.println("The number was "+ myNum);


        }
    }


