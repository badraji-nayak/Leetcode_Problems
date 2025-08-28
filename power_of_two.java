class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){          // Step 1: Negative numbers and 0 cannot be powers of 2
            return false;
        }
        while(n % 2 == 0){   // Step 2: Keep dividing by 2 while it is divisible by 2
            n = n / 2;
        }
        return n == 1;       // Step 3: If we reduced it to 1, it’s a power of two
    }
}
