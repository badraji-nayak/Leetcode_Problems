class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length + nums2.length];
        int i = 0;
        for (int n : nums1) {
            num[i++] = n;
        }
        for (int n : nums2) {
            num[i++] = n;
        }

        Arrays.sort(num);

        int n = num.length;
        if (n % 2 == 1) {
            // Odd length – return middle element
            return num[n / 2];
        } else {
            // Even length – average of two middle elements
            return (num[n / 2 - 1] + num[n / 2]) / 2.0;
        }
    }
}
