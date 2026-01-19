package Assignment2;

import java.util.Scanner;

public class Person {
    String name;
    int age;
    Person(){
        this.age = 18;
    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void getName(){
        System.out.println("Name is " + this.name);
    }
    public void getAge(){
        System.out.println("Age is " + this.age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Name");
        String name = sc.nextLine();
        System.out.println("Please enter your Age(Default age is 18 )");
        int age = sc.nextInt();
        Person person1 = new Person();
        person1.getAge();
        Person person2 = new Person(name , age);
        person2.getName();
        person2.getAge();
    }
}
