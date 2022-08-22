package MyPackage.OOP3.inheritance;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Person person1 = new Person("Negar","Moosavi",19);
        Student student1 = new Student("Mersad","Moghaddam",21,1);
        Teacher teacher1 = new Teacher("Mehdi","Abbasi",48,1);
        person1.PrintPersoninfo();
        student1.PrintPersoninfo();
        student1.Print();
        teacher1.PrintPersoninfo();
        teacher1.Print();
        System.out.println("____________________________________________________________");
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Student Name : ");
            String Student_Name=reader.next();
            System.out.print("Student Family : ");
            String Student_Family=reader.next();
            System.out.print("Student Age : ");
            int Student_Age=reader.nextInt();
            System.out.print("Student ID : ");
            int Student_ID=reader.nextInt();
            Student student2 = new Student(Student_Name,Student_Family,Student_Age,Student_ID);
            student2.PrintPersoninfo();
            student2.Print();
        }
        }
}