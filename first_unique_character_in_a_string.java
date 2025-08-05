class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26]; // Create a frequency array for 26 lowercase English letters

        // Step 1: Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++; // Map character to index (e.g., 'a' -> 0, 'b' -> 1, ..., 'z' -> 25)
        }

        // Step 2: Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i; // Return index of first unique character
            }
        }

        return -1; // If no unique character is found
    }
}
