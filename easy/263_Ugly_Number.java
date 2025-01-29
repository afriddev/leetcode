/**
     * Time Complexity - O(log N)
     * Runtime - 1ms
     * Beats - 47%
     */
class Solution {
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 3 == 0) {
                n = n / 3;
            } else {
                n = n / 5;
            }
        }
        return n == 1;
    }
}
