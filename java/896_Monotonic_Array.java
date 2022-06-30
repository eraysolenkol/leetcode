/* An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise. */

class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }
        boolean isIncreasing;
        if (nums[0] < nums[nums.length-1]) {
            isIncreasing = true;
        } else {
            isIncreasing = false;
        }
        
        if (isIncreasing) {
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] > nums[i+1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] < nums[i+1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
