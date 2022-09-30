package leetcode;

public class Maximize_Distance_to_Closest_Person {
    class Solution {
        public int maxDistToClosest(int[] seats) {
            int maxDist = 0;
            int start = 0;
            int n = seats.length;
            for (int i = 0; i < n; i++) {
                if ((seats[i] == 1 && start == 0 && seats[start] == 0) || (i == n - 1 && seats[i] == 0)) {
                    maxDist = Math.max(maxDist, i - start);
                    start = i;
                } else if (seats[i] == 1) {
                    maxDist = Math.max(maxDist, (i - start) / 2);
                    start = i;
                }
            }
            return maxDist;
        }

    }

    public static void main(String[] args) {

    }
}
