import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);  // Step 1: Sort the array
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            // Step 2: Compare current element with previous one
            if (nums[i] == nums[i - 1]) {
                // Step 3: Check if it's already in the result to avoid adding twice
                if (duplicates.isEmpty() || duplicates.get(duplicates.size() - 1) != nums[i]) {
                    duplicates.add(nums[i]);
                }
            }
        }

        return duplicates;
    }
}
