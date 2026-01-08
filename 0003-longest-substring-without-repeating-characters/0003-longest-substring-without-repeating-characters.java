class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        // Map to store the last seen index of a character + 1
        HashMap<Character, Integer> map = new HashMap<>(); 

        // i is the left pointer, j is the right pointer
        for (int j = 0, i = 0; j < n; j++) {
            char currentChar = s.charAt(j);
            
            if (map.containsKey(currentChar)) {
                // Move the left pointer to the right of the last seen duplicate
                // We use Math.max to ensure 'i' never moves backward
                i = Math.max(map.get(currentChar), i);
            }
            
            // Calculate the current window size and update max
            maxLength = Math.max(maxLength, j - i + 1);
            
            
            map.put(currentChar, j + 1);
        }
        
        return maxLength;
    
    }
}