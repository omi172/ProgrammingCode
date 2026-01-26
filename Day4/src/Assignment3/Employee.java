package Assignment3;

public class Employee implements Taxable{
    int empID;
    double salary;
    String name;
    Employee(int empID,String name,long salary){
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax(){
        double taxAmount = (incomeTax / 100) * salary;
        double finalSalary = salary - taxAmount;
        System.out.println("Tax Amount is : "+ taxAmount + " and salary after tax : " +finalSalary);
    }
}
