import java.lang.reflect.Array;
import java.util.ArrayList;

public class Problem_04 {
    public static boolean is_palindrome(int number) {
        String number_str = Integer.toString(number);
        int length = number_str.length();
        for (int i = 0; i < length / 2; i++) {
            if (number_str.charAt(i) != number_str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int topNumber = 999;
        int bottomNumber = 100;
        int largestPalindrome = Integer.MIN_VALUE;
        ArrayList<Integer> palindromes = new ArrayList<Integer>();

        outerLoop:
        for (int i = topNumber; i >= bottomNumber; i--) {
            for (int j = topNumber; j >= bottomNumber; j--) {
                if (is_palindrome(i * j)) {
                    palindromes.add(i * j);
                }
            }
        }
        
        for (int i = 0; i < palindromes.size(); i++) {
            if (palindromes.get(i) > largestPalindrome) {
                largestPalindrome = palindromes.get(i);
            }
        }

        System.out.println("The largest palindrome made from the product of two 3-digit numbers is " + largestPalindrome);
    
    }
}