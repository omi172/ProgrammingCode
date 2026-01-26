package Assignment3;

public class Product implements Taxable{
    int pID;
    int price;
    int quantity;
    Product(int pID, int price, int quantity){
        this.pID = pID;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        double taxAmount = (salesTax / 100) * price;
        double finalSalary = price - taxAmount;
        System.out.println("Sales Tax Amount on per unit is : "+ taxAmount + " and salary after tax : " +finalSalary * quantity);
    }
}
