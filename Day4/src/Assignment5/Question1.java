package Assignment5;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of words ");
        int n = sc.nextInt();
        ArrayList<String> words = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String word = sc.next();
            words.add(word);
        }
        List<String> result = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        for(String wordd : result){
            System.out.println(wordd);
        }
    }
}
