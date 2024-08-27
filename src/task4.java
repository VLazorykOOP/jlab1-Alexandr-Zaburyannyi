import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");

        String text = scanner.nextLine();

        String[] words = text.split(" ");

        List<String> alphabeticWords = new ArrayList<String>();

        for (String word : words) {
            if (isAlphabeticalOrder(word)) {
                alphabeticWords.add(word);
            }
        }
     System.out.println(alphabeticWords);
    }
    public static boolean isAlphabeticalOrder(String word) {
        word = word.toLowerCase();

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
