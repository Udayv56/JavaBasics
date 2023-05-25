import java.util.*;


class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Account {
    public String name;
    protected String email;
    private String password;
    public void setPassword(String password) {
        this.password = password;
    }

}



class Student{
    String name;
    int age;
    static String school; // common for everyone

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    Student(){
        System.out.println("Constructor called");
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(Student s2){ //copy constructor
        this.name = s2.name;
        this.age = s2.age;
    }
}

class Shape{
    String color;
}

class Triangle extends Shape {  //inheritance (single)
    public void show(){
        System.out.println(this.color);
    }
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}
class EquiTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animal eats");
    }

}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }

}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }

}

// interfaces only abstract function (no defiantion) used for multiple inheritance.
// interfaces are implemented not extended. methods are by default public and abstract.

public class OOPS{
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();
        pen1.printColor();

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "Uday";
        s1.age = 21;
        s1.printInfo();

        Student s2 = new Student("Hemant", 47);
        s2.printInfo();
        Student s3 = new Student(s2);
        s3.printInfo();
        // Java has its own garbage collector, no need for destructors IMP


        Student s4 = new Student();
        s4.printInfo("Sangeeta");

        Triangle t1 = new Triangle();
        t1.color = "Yellow";
        t1.show();

        Account account1 = new Account();
        account1.name = "Uday verma";
        account1.email = "udayv@gmail.com";
        account1.setPassword("abcdfg");

        Horse h = new Horse();
        h.walk();
        h.eat();

        Chicken c = new Chicken();
        c.walk();

        Student.school = "BVM";
        System.out.println(s4.school);
    }


}
