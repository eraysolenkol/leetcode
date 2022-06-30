/* Implement strStr().

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf(). */

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        } 
        for (int i = 0; i < haystack.length(); i++) { 
            if (needle.charAt(0) == haystack.charAt(i)) {
                int count = 0;
                for (int j = 0; j < needle.length(); j++) {
                    if (i+j < haystack.length() && haystack.charAt(i+j) == needle.charAt(j)) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}
