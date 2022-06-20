/* You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
Return the average salary of employees excluding the minimum and maximum salary. */

class Solution {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        int total = 0;
      
        for (int i = 0; i < salary.length; i++) {
            total += salary[i];
            if (salary[i] > max) {
                max = salary[i];
            } 
            if (salary[i] < min) {
                min = salary[i];
            }
        }
        return (total - min - max) * 1.0 / (salary.length - 2);
    }
}
