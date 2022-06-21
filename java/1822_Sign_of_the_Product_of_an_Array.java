/* There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums. */

class Solution {
    public int arraySign(int[] nums) {
        int productSign = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                productSign *= 1;
            } else if (nums[i] < 0) {
                productSign *= -1;
            } else {
                return 0;
            }
        }
        return productSign;
    }
}
