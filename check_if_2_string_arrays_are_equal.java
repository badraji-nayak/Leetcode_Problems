class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Initialize an empty string to store concatenated result of word1
        String s1 = "";
        
        // Concatenate all strings in word1 array
        for (String str : word1) {
            s1 += str;
        }

        // Initialize an empty string to store concatenated result of word2
        String s2 = "";
        
        // Concatenate all strings in word2 array
        for (String str : word2) {
            s2 += str;
        }

        // Compare the two concatenated strings and return the result
        return s1.equals(s2);
    }
}
