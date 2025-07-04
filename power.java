class Solution {
    public double myPow(double x, int n) {
        // Initialize the result to 1.0
        double res = 1.0;

        // Use long type to safely handle cases where n is Integer.MIN_VALUE
        long pow = n;

        // If the power is negative, take reciprocal of x and make power positive
        if (pow < 0) {
            x = 1 / x;        // Invert x if n is negative
            pow = -pow;       // Convert n to positive
        }

        // Loop until power becomes 0
        while (pow > 0) {
            // If power is odd
            if (pow % 2 == 1) {
                res = res * x;   // Multiply result with current x
                pow--;           // Decrease power by 1 to make it even
            } else {
                x = x * x;       // Square the base
                pow /= 2;        // Halve the power
            }
        }

        // Return the final result
        return res;
    }
}
