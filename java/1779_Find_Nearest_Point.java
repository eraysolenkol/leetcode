/* You are given two integers, x and y, which represent your current location on a Cartesian grid: (x, y).
You are also given an array points where each points[i] = [ai, bi] represents that a point exists at (ai, bi).
A point is valid if it shares the same x-coordinate or the same y-coordinate as your location.
Return the index (0-indexed) of the valid point with the smallest Manhattan distance from your current location.
If there are multiple, return the valid point with the smallest index. If there are no valid points, return -1. */

class Solution {
    public boolean isValid(int x1, int x2, int y1, int y2 ) {
        return x1 == x2 || y1 == y2;
    }
    
    public int findDistance(int x1, int x2, int y1, int y2 ) {
        return Math.abs(x1-x2) + Math.abs(y1-y2);
    }
    
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDistance = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < points.length; i++) {
                if(isValid(x,points[i][0],y,points[i][1])) {
                    int distance = findDistance(x,points[i][0],y,points[i][1]);
                    if (distance < minDistance) {
                        minDistance = distance;
                        index = i;
                    }
                }
            }
        return index;
    }
}
