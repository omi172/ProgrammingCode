package Assignment5;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
         words.add("abc");
        words.add("");
        words.add("bc");
        words.add("efg");
        words.add("abcd");
        words.add("");
        words.add("jkl");
        List<String> result = words.stream()
                .filter(word -> (!word.equals(""))).collect(Collectors.toList());
        for (String wordd : result) {
            System.out.println(wordd);
        }
    }
}
