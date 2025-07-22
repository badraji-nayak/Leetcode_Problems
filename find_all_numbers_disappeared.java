class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int freq[] = new int[nums.length + 1];  // Frequency array of size n+1 (index 0 is unused)
        ArrayList<Integer> res = new ArrayList<>();  // To store the result

        // Count the frequency of each number in nums
        for (int val : nums) {
            freq[val]++;
        }

        // Check which numbers from 1 to n are missing (i.e., frequency is 0)
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 0) {
                res.add(i);  // If number i is missing, add it to result
            }
        }

        return res;
    }
}
