/* A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise. */

class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            if (letter >= 'a' && letter <= 'z' && !set.contains(letter)) {
                set.add(letter);
            }
        }
        return set.size() == 26;
    }
}
