import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int a = n;
        for(int i = 0; i < n; i++){
            a = n;
            for(int j = 0; j < n; j++){
                if(i > j){
                    System.out.print(a + " ");
                    a--;
                }else{
                    System.out.print(a + " ");
                }
            }
            System.out.println();
        }
    }
}
