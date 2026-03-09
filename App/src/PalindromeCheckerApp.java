import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "A man a plan a canal Panama"
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        // Inject strategy (Two Pointer Strategy here)
        PalindromeStrategy strategy = new TwoPointerStrategy();

        // Capture start time
        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        // Capture end time
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        // Display results
        System.out.println("Input: " + input);
        System.out.println("Using Strategy: TwoPointerStrategy");
        System.out.println("Is Palindrome?: " + result);
        System.out.println("Execution Time (nanoseconds): " + duration);
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class TwoPointerStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}