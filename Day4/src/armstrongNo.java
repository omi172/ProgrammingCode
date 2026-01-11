public class armstrongNo {
    public static void main(String[] args) {
        int number = 1634, number2 = number, number3 = number;
        int n = 0;
        while(number > 0){
            n++;
            number /= 10;
        }
        int sum = 0;
        while(number2 > 0){
            int rem = number2 % 10;
            for(int i = 1; i < n; i++){
                rem *= rem;
            }
            sum += rem;
            number2 /= 10;
        }
        if(sum == number3){
            System.out.println(number3 + " is an Armstrong number ");
        }else{
            System.out.println(number3 + " is not an Armstrong number ");
        }
    }
}
