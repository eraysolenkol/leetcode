/* Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not. */

class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != num.charAt(num.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
