/* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array. */

class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if (nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
