/* A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence. */

class Solution {
    
    public int findWordCount(String sentence) {
        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
    
    public int mostWordsFound(String[] sentences) {
        int max = findWordCount(sentences[0]);
        for (int i = 0; i < sentences.length; i++) {
            max = Math.max(max, findWordCount(sentences[i]));
        }
        return max;
    }
}
