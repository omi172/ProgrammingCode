import java.util.Scanner;
public class smallestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
          int a = sc.nextInt();
        System.out.println("Enter B");
          int b = sc.nextInt();
        System.out.println("Enter C");
          int c = sc.nextInt();
       if(a > b){
           if(b > c){
               System.out.println("Smallest number is " + c);
           }else{
               System.out.println("Smallest number is " + b);
           }
       }else{
           if(a > c){
               System.out.println("Smallest number is " + c);
           }else{
               System.out.println("Smallest number is " + a);
           }
       }
    }
}
