/* International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words we have. */

class Solution {
    public String getMorseString(HashMap map, String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append(map.get(word.charAt(i)));
        }
        return sb.toString();
    }
    
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> uniqueMorses = new HashSet<>();
      
        String[] alphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (int i = 0; i < alphabet.length; i++) {
            map.put((char) (i+97), alphabet[i]);
        }
        
        for (int i = 0; i< words.length; i++) {
            uniqueMorses.add(getMorseString(map, words[i]));
        }
        return uniqueMorses.size();
    }
    
}
