class Solution {
    public int majorityElement(int[] nums) {
        // Step 1: Create a HashMap to store frequency of each number
        HashMap<Integer,Integer> map = new HashMap<>();

        // Step 2: Count the frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 3: Check which element occurs more than n/2 times
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 2) {
                return key; // Majority element found
            }
        }

        // Step 4: If no majority element, return -1 (but problem guarantees one exists)
        return -1;
    }
}
