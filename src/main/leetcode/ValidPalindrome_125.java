package main.leetcode;

/**
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 */
public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        char[] characters = s.toCharArray();
        int left = 0; int right = s.length()-1;
        while (left < right) {
            if (Character.isLetterOrDigit(characters[left])) {
                if (Character.isLetterOrDigit(characters[right])) {
                    if(Character.toLowerCase(characters[left]) != Character.toLowerCase(characters[right])){
                        return false;
                    } else {
                        left++;
                        right--;
                    }
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }

        return true;
    }
}
