class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();   // length of first string
        int m = text2.length();   // length of second string

        // dp[i][j] will store the LCS length of text1[0..i-1] and text2[0..j-1]
        int[][] dp = new int[n + 1][m + 1];

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                // If current characters match, take diagonal + 1
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } 
                // Otherwise, take the maximum from top or left cell
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // dp[n][m] contains the length of the LCS of full strings
        return dp[n][m];
    }
}
