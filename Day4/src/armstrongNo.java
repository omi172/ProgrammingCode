public class armstrongNo {
    public static void main(String[] args) {
        int number = 1634, number2 = number, number3 = number;
        int n = 0;
        while(number > 0){
            n++;
            number /= 10;
        }
        int sum = 0;
        while(number > 0){
            int rem = number % 10;
            for(int i = 1; i < n; i++){
                rem *= rem;
            }
            sum += rem;
            number /= 10;
        }
        if(sum == number){
            System.out.println(number3 + " is an Armstrong number ");
        }else{
            System.out.println(number3 + " is not an Armstrong number ");
        }
    }
}
