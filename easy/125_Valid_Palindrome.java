class Solution {
    public boolean isPalindrome(String s) {
        String a = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = 0;
        int r = a.length() - 1;
        while (l < a.length()/2){
            if(a.charAt(l) == a.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return  true;
    }
}
