/* You are given two strings s1 and s2 of equal length.
A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.
Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false. */

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int difference = 0;
        HashMap<Character,Integer> mapS1 = new HashMap<>();
        HashMap<Character,Integer> mapS2 = new HashMap<>();
        
        for (int i = 0; i < s1.length(); i++) {
            
            if (mapS1.containsKey(s1.charAt(i))) {
                mapS1.put(s1.charAt(i), mapS1.get(s1.charAt(i)) + 1);
            } else {
                mapS1.put(s1.charAt(i), 1);
            }

            if (mapS2.containsKey(s2.charAt(i))) {
                mapS2.put(s2.charAt(i), mapS2.get(s2.charAt(i)) + 1);
            } else {
                mapS2.put(s2.charAt(i), 1);
            }

            if (!(s1.charAt(i) == s2.charAt(i))) {
                difference++;
            }
            
        }
        
        if (difference > 2  || (!mapS1.equals(mapS2))) {
            return false;
        }
        return true;
    }
}
