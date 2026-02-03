package Assignment4.Question1;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of students");
        int number = sc.nextInt();
        Student students[] = new Student[number];
        for(int i = 0; i < number; i++){
            System.out.println("Enter Roll Number");
            int rollNo = sc.nextInt();
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter age");
            int age = sc.nextInt();
            System.out.println("Enter course");
            String course = sc.next();
            students[i] = new Student(rollNo, name, age, course);
        }
        checkValidName(students);
        checkValidAge(students);
    }
    static void checkValidAge(Student students[]){
       for(Student student : students){
           try{
               CheckAge checkAge = new CheckAge(student.getAge());
               checkAge.check();
           }catch (AgeNotWithinRangeException e){
               System.out.println(e.getMessage());
           }
       }
    }
    static void checkValidName(Student students[]){
        for(Student student : students){
            try{
                CheckName checkname = new CheckName(student.getName());
                checkname.check();
            }catch (NameNotValidException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
