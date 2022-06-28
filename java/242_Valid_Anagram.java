/* Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. */
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mapS = new HashMap<>();
        HashMap<Character,Integer> mapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if (mapS.containsKey(s.charAt(i))) {
                mapS.replace(s.charAt(i),mapS.get(s.charAt(i)) + 1);
            } else {
                mapS.put(s.charAt(i),1);
            }
            if (mapT.containsKey(t.charAt(i))) {
                mapT.replace(t.charAt(i),mapT.get(t.charAt(i)) + 1);
            } else {
                mapT.put(t.charAt(i),1);
            }
        }
        return mapS.equals(mapT);
    }
}

// SOLUTION 2

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        return Arrays.equals(sCharArray,tCharArray);
    }
}
