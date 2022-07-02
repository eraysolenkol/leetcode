/* Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]". */

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}

// SOLUTION 2

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
