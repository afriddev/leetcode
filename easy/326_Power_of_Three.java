class Solution {
    public static boolean isPowerOfThree(int n) {
        int index = 0;
        while (true) {
            if (Math.pow(3, index) > n) {
                break;
            }
            if ((int) Math.pow(3, index) == n) {
                return true;
            }
            
            index = index +1;
        }
        return false;
    }
}
