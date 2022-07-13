/* You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows: 
Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves. */

class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> alphabet = new HashMap<>();
        char ch = 'a';
        alphabet.put(' ',' ');
        for (int i = 0; i < key.length(); i++) {
            if (!alphabet.containsKey(key.charAt(i))) {
                alphabet.put(key.charAt(i),ch);
                ch++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            sb.append(alphabet.get(message.charAt(i)));
        }
        return sb.toString();
    }
}
