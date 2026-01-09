import java.util.Scanner;
public class payableAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int discountedAmount = 0;
        if(amount < 500){
            discountedAmount = amount;
        }else if(amount >= 500 && amount <= 1000){
            discountedAmount = amount - (amount / 100) * 10;
        }else{
            discountedAmount = amount - (amount / 100) * 20;
        }
        System.out.println(" The final payable amount after applying the discount " + discountedAmount);
    }
}
