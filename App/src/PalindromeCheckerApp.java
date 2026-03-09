public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded input
        String input = "madam";
        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int j = 0; j < input.length() / 2; j++) {

            if (input.charAt(j) != input.charAt(input.length() - 1 - j)) {
                isPalindrome = false;
                break;
            }
        }

        // Display results
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }

}