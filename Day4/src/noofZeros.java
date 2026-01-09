public class noofZeros {
    public static void main(String[] args) {
        int number = 700001001;
        int count = 0, max = 0;
        while(number > 0){
            int rem = number % 10;
            if(rem == 0){
                count++;
            }else{
                max = Math.max(count / 2, max);
                count = 0;
            }
            number /= 10;
        }
        System.out.println(max);
    }
}
