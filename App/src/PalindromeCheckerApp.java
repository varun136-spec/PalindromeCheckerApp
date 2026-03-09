import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Normalize: remove non-alphanumeric characters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Original Input: " + input);
        System.out.println("Normalized Input: " + normalized);
        System.out.println("Is Palindrome?:");
        System.out.println(isPalindrome);
    }
}