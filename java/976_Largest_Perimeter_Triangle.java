/* Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths.
If it is impossible to form any triangle of a non-zero area, return 0. */
class Solution {
    public boolean isValidTriangle(int i, int j, int k) {
        return (j + k) > i;
    }
    
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length-1; i > 1; i--) {
            if (isValidTriangle(nums[i],nums[i-1],nums[i-2])) {
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }
        return 0;
    }
}
