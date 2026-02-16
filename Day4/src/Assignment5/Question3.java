package Assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student");
        int n = sc.nextInt();
        ArrayList<String> students = new ArrayList<>();
        for(int i = 0; i < n; i++){
            students.add(sc.next());
        }
        List<String> names = students.stream().filter(student -> student.startsWith("A")).collect(Collectors.toList());
        System.out.println(names);
    }
}
