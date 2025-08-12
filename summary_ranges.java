class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> res = new ArrayList<>();
        int end = 0;

        while (end < nums.length) {
            int start = end;

            // Extend the range while the next number is consecutive
            while (end + 1 < nums.length && nums[end + 1] == nums[end] + 1) {
                end++;
            }

            // If start == end, only one number in range
            if (end == start) {
                res.add(nums[start] + "");
            } else {
                res.add(nums[start] + "->" + nums[end]);
            }

            // Move to next element after finishing a range
            end++;
        }

        return res;
    }
}
