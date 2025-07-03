class Solution {
    public int reverse(int x) {
        long rev = 0;               // Use long to handle potential overflow temporarily
        boolean neg = false;        // Flag to track if the number is negative

        // Step 1: Check if number is negative
        if (x < 0) {
            neg = true;             // Set flag if negative
            x = x * (-1);           // Convert to positive for processing
        }

        // Step 2: Extract digits one by one and build the reversed number
        while (x > 0) {
            int rem = x % 10;       // Get the last digit
            rev = rev * 10 + rem;   // Append digit to the reversed number

            // Step 3: Check for overflow beyond 32-bit signed integer range
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;           // Return 0 if overflow occurs
            }

            x = x / 10;             // Remove the last digit from x
        }

        // Step 4: Restore the sign if original number was negative
        return neg ? (int)(rev * -1) : (int)rev;
    }
}
