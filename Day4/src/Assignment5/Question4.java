package Assignment5;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year, month, day:");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.println("Your age is: " + age.getYears() + " years, "
                + age.getMonths() + " months, and "
                + age.getDays() + " days.");
    }
}