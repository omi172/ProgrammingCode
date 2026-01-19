package Assignment2;
import java.util.Scanner;

public class ProductMain{
    static class Product {
        int pId;
        int price;
        int quantity;
        Product(int pId,int price,int quantity){
            this.pId = pId;
            this.price = price;
            this.quantity = quantity;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product products[] = new Product[5];
        System.out.println("Enter product items");
        for(int i = 0; i < 5; i++){
            products[i] = new Product(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        System.out.println("Maximum Price " + getMaxPrice(products));
        System.out.println("Total Amount " + getTotalAmount(products));
    }
    static int getMaxPrice(Product products[]){
        int maxPID = 0;
        int maxPrice = products[0].price;
        for(int i = 1; i < 5; i++){
            if(maxPrice < products[i].price){
                maxPID = i;
                maxPrice = products[i].price;
            }
        }
        return maxPrice;
    }
    static int getTotalAmount(Product products[]){
        int totalAmount = 0;
        for(int i = 1; i < 5; i++){
            totalAmount += products[i].price * products[i].quantity;
        }
        return totalAmount;
    }
}