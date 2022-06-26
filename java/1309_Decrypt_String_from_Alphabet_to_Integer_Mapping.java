/* You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping. */

class Solution {
    public String freqAlphabets(String s) {
        String ans = "";
        HashMap<String,Character> map = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            map.put(Integer.toString(i), (char)(i+96));
        }
        for (int i = 10; i < 27; i++) {
            map.put(String.format("%d#",i), (char)(i+96));
        }
        int i = 0;
        while (i < s.length()) {
            if (i+2 < s.length() && s.charAt(i+2) == '#') {
                ans += map.get(s.substring(i,i+3));
                i += 3;
            } else {
                ans += map.get(s.substring(i,i+1));
                i++;
            }
        }
        return ans;
    }
}
