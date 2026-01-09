public class reverseANumber {
    public static void main(String[] args) {
        int n = 0;
        int number = 12345;
        while(number > 0){
            int rem = number % 10;
            n = 10 * n + rem;
            number /= 10;
        }
        System.out.println(n);
    }
}
