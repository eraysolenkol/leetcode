/* Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.

A substring is a contiguous sequence of characters within a string. */

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        
        for (int i = 0; i < patterns.length; i++) {
            if (word.indexOf(patterns[i]) != -1) {
                count++;
            }
        }
        return count;
    }
}
