package Assignment4.Question4;

import java.util.HashSet;

public class HashMap{
    static HashSet<MyNode> store;
    public static void main(String[] args) {
        store = new HashSet<>();
        addStudent("amit",80);
        addStudent("Sumit",81);
        addStudent("Abhijeet",82);
        addStudent("Amal",83);
        displayGrade("amit");
        removeStudent("amit");
        removeStudent("amit");
        displayGrade("amit");
    }
    static void addStudent(String name,int grade){
        MyNode newStudent = new MyNode(name, grade);
        store.add(newStudent);
        System.out.println("Student added");
    }
    static void removeStudent(String name){
        for(MyNode student : store){
            String studentName = (String) student.name;
            if(studentName.equals(name)){
                store.remove(student);
                return;
            }
        }
        System.out.println("Student is not present for removing");
    }

    static void displayGrade(String name){
        for(MyNode student : store){
            String studentName = (String) student.name;
            if(studentName.equals(name)){
                System.out.println(student.name + " grade is " + student.grade);
                return;
            }
        }
        System.out.println("Student is not present for displaying grade");
    }


}

