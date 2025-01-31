class Solution {
    public static int arrangeCoins(int n) {
        int index = 1;
        long sum = 0;

        while (sum < n) {
            if (sum + index == n) {
                return index;
            }
            if (sum + index > n) {
                return index - 1;
            }
            sum = sum + index;
            index = index + 1;
        }
        return 0;
    }
}
