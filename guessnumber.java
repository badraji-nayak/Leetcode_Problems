// This is a placeholder for the GuessGame class.
// In the actual LeetCode environment, it is already provided.
class GuessGame {
    // Simulates the guess API.
    // Returns:
    // -1 : The picked number is lower than the guess
    //  1 : The picked number is higher than the guess
    //  0 : Correct guess
    int guess(int num) {
        // This would normally be hidden; assume implementation is provided.
        return 0; // placeholder
    }
}

// Your class extends GuessGame to access the guess() method.
public class Solution extends GuessGame {
    
    // This method tries to guess the number picked using binary search.
    public int guessNumber(int n) {
        int start = 1;      // Start of search range
        int end = n;        // End of search range

        // Binary Search Loop
        while (start <= end) {
            // To prevent integer overflow when computing mid
            int mid = start + (end - start) / 2;

            // Use the guess API to compare mid with the picked number
            int result = guess(mid);

            if (result == 0) {
                // Correct guess
                return mid;
            } else if (result < 0) {
                // Picked number is lower than mid, search left half
                end = mid - 1;
            } else {
                // Picked number is higher than mid, search right half
                start = mid + 1;
            }
        }

        // If number not found (theoretically not possible as per problem constraints)
        return -1;
    }
}
