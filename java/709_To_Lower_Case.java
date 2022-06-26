/* Given a string s, return the string after replacing every uppercase letter with the same lowercase letter. */

class Solution {
    public String toLowerCase(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ans += (char)(s.charAt(i) + 32);
            } else {
                ans += s.charAt(i);
            }   
        }
        return ans;
    }
}
