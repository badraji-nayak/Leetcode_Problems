class Solution {
    public void moveZeroes(int[] nums) {
        int zp = 0;  // Zero pointer (tracks position to place non-zero value)
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                // Swap nums[i] with nums[zp]
                int temp = nums[i];
                nums[i] = nums[zp];
                nums[zp] = temp;
                
                // Move zero pointer forward
                zp++;
            }
        }
    }
}
