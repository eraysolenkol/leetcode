/* Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct element. */

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> sortedElements = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sortedElements.add(matrix[i][j]);
            }
        }
        Collections.sort(sortedElements);
        return sortedElements.get(k-1);
    }
}
