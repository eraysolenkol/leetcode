/* There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies. */
class Solution {
    
    public int findGreatestCandyNumber(int candies[]) {
        int greatestCandyNumber = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (greatestCandyNumber < candies[i]) {
                greatestCandyNumber = candies[i];
            }
        }
        return greatest;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int greatestCandyNumber = findGreatestCandyNumber(candies); 
        for (int i = 0; i < candies.length; i++) {
            if (greatestCandyNumber <= candies[i] + extraCandies) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
