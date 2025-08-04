class Solution {
    public String reverseVowels(String s) {
        // Create a HashSet to store all vowels (both lowercase and uppercase)
        HashSet<Character> set = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) {
            set.add(c);
        }

        // Convert the string to a character array for easy modification
        char[] arr = s.toCharArray();

        // Initialize two pointers: one from the start, one from the end
        int left = 0;
        int right = arr.length - 1;

        // Loop until the two pointers meet
        while (left < right) {
            // If both characters are vowels, swap them
            if (set.contains(arr[left]) && set.contains(arr[right])) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            // If left character is not a vowel, move left pointer forward
            else if (!set.contains(arr[left])) {
                left++;
            }
            // If right character is not a vowel, move right pointer backward
            else {
                right--;
            }
        }

        // Convert the modified character array back to a string and return
        return new String(arr);
    }
}
