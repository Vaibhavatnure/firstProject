package Practise;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String word = scanner.nextLine();

        int count = countWord(input, word);
        System.out.println (count);
    }

    private static int countWord(String input, String word) {
        String[] words = input.split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String w : words) {
            wordCountMap.put(w, wordCountMap.getOrDefault(w, 0) + 1);
        }

        return wordCountMap.getOrDefault(word, 0);
    }
}
