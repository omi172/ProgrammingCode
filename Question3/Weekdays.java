package Assignment4.Question3;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        String week[] = new String[7];
        week[0] = "Sunday";
        week[1] = "Monday";
        week[2] = "Tuesday";
        week[3] = "Wednesday";
        week[4] = "Thrusday";
        week[5] = "Friday";
        week[6] = "Saturday";
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        check(number,week);
    }
    static void check(int number,String week[]) {
        try {
            checkDays checkday = new checkDays(number);
            checkday.check();
            System.out.println(week[number]);
        } catch (InvalidUserInputException e) {
            System.out.println(e.getMessage());
        }
    }
}
