import java.util.Scanner;

abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void displayDetails();
}

class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    int subjectCode;

    Teacher(String name, int age, int subjectCode) {
        super(name, age);
        this.subjectCode = subjectCode;
    }

    @Override
    void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject Code: " + subjectCode);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Person type (1 for Student, 2 for Teacher):");
        int type = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        if (type == 1) {
            System.out.println("Enter Roll Number:");
            int rollNumber = sc.nextInt();
            Student student = new Student(name, age, rollNumber);
            student.displayDetails();
        } else if (type == 2) {
            System.out.println("Enter Subject Code:");
            int subjectCode = sc.nextInt();
            Teacher teacher = new Teacher(name, age, subjectCode);
            teacher.displayDetails();
        } else {
            System.out.println("Invalid Person type!");
        }

        sc.close();
    }
}
