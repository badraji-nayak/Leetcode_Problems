class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of characters in s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Subtract frequency using t
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false; // char not found
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c); // clean up
            }
        }

        // If all counts are zero, map should be empty
        return map.isEmpty();
    }
}
