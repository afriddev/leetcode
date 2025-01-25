/**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
class Solution {
    public  boolean checkPerfectNumber(int num) {
        List<Integer> divisors = new ArrayList<>();
        for (int index = 1; index <= num / 2; index++) {
            if (num % index == 0) {
                divisors.add(index);
            }
        }
        int result = 0;
        for (int index = 0; index < divisors.size(); index++) {
            result = result + divisors.get(index);
        }
        return result == num;
    }
   
   
}
