package Assignment3;

public class DriverMain {
    public static void main(String[] args) {
        Employee employee = new Employee(101,"Amit Roy",10000);
        Product product = new Product(1001, 20000,2);
        employee.calcTax();
        product.calcTax();
    }
}
