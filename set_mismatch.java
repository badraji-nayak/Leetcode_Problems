class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int res[] = new int[2];
        int freq[] = new int[n + 1]; // Frequency array of size n+1 (1-based indexing)

        for (int val : nums) {
            freq[val]++; // Count frequency of each number
        }

        for (int i = 1; i <= n; i++) {  // i starts from 1 to n
            if (freq[i] == 2) {
                res[0] = i; // Number that occurs twice (duplicate)
            }
            if (freq[i] == 0) {
                res[1] = i; // Number that is missing
            }
        }

        return res;
    }
}