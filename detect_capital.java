class Solution {
    public boolean detectCapitalUse(String word) {
        // Case 1: All letters are uppercase (e.g., "USA")
        if(word.equals(word.toUpperCase())){
            return true;
        }
        // Case 2: All letters are lowercase (e.g., "hello")
        else if(word.equals(word.toLowerCase())){
            return true;
        }
        // Case 3: Only the first letter is uppercase, and the rest are lowercase (e.g., "Google")
        else if(word.substring(0,1).equals(word.substring(0,1).toUpperCase()) 
                && word.substring(1).equals(word.substring(1).toLowerCase())){
            return true;
        }
        // Any other case is incorrect (e.g., "FlaG")
        return false;
    }
}
