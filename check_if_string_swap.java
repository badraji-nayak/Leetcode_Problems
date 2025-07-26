class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int check[] = new int[2]; // stores indices of mismatched characters
        int count = 0; // counts number of mismatches
        
        // Step 1: Check character mismatches
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++; // increase mismatch count
                
                if (count > 2) {
                    return false; // more than 2 mismatches → can't fix with one swap
                }

                // Save mismatch positions
                if (count == 1) check[0] = i;
                if (count == 2) check[1] = i;
            }
        }

        // Step 2: If strings are already equal
        if (count == 0) return true;

        // Step 3: If only one mismatch, can't fix with a swap
        if (count != 2) return false;

        // Step 4: Check if swapping mismatched characters fixes the strings
        return s1.charAt(check[0]) == s2.charAt(check[1]) &&
               s1.charAt(check[1]) == s2.charAt(check[0]);
    }
}
