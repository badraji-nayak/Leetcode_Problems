class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");                    // Split the string by spaces into an array of words
        String lastword = arr[arr.length - 1];          // Get the last element from the array
        return lastword.length();                       // Return the length of the last word
    }
}
