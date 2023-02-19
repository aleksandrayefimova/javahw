import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        int length1 = word1.length() / 2;
        int length2 = word2.length() / 2;

        String newWord = word1.substring(0, length1) + word2.substring(0, length2);

        System.out.println("The new word is: " + newWord);
    }
}
