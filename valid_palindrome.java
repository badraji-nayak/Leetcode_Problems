class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from the left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters from the right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Convert characters to lowercase for case-insensitive comparison
            char lc = Character.toLowerCase(s.charAt(left));
            char rc = Character.toLowerCase(s.charAt(right));

            // If characters do not match, it's not a palindrome
            if (lc != rc) {
                return false;
            }

            // Move pointers inward
            left++;
            right--;
        }

        // All characters matched; it's a valid palindrome
        return true;
    }
}
