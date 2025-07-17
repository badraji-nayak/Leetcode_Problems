class Solution {
    public boolean isPalindrome(int x) {
        // Step 1: Negative numbers can't be palindromes
        if(x < 0){
            return false;
        }

        // Step 2: Save the original number to compare later
        int rev = 0;
        int original = x;

        // Step 3: Reverse the number
        while(x > 0){
            int id = x % 10;        // Get last digit of x
            rev = rev * 10 + id;    // Add it to the reversed number
            x = x / 10;             // Remove the last digit from x
        }

        // Step 4: Check if original number equals reversed number
        return original == rev;
    }
}
