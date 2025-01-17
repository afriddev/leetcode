class Solution {
        public static int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int index = 0; index <= n; index++) {
            String binary = Integer.toBinaryString(index);
            result[index] = binary.length() - binary.replaceAll("1", "").length();
        }
        return result;
    }
}
