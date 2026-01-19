package Assignment2;

public class Person2 {
    String name;
    int age;
    Person2(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person2{
    int employeeID;
    int salary;
    Employee(String name, int age,int employeeID,int salary){
        super(name,age);
        this.employeeID = employeeID;
        this.salary = salary;
    }
}
class Main{
    public static void main(String[] args) {
        Employee employee = new Employee("Amit Roy",29,101,10000);
        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.employeeID);
        System.out.println(employee.salary);
    }
}
