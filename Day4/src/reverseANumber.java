import java.util.Scanner;
public class reverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter a number");
        int number = sc.nextInt();
        while(number > 0){
            int rem = number % 10;
            n = 10 * n + rem;
            number /= 10;
        }
        System.out.println(n);
    }
}
