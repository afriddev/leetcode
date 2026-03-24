class Solution {
    public String firstPalindrome(String[] words) {


        for (int i = 0 ;i< words.length;i++){
            int j = 0 ;
            int k = words[i].length()-1;
            boolean palindrome = true;
            while(j < k){
                if(words[i].charAt(j) == words[i].charAt(k)  ){
                    j++;
                    k--;
                }
                else{
                    palindrome = false;
                    break;
                }
            }
            if(palindrome) return words[i];
        }
        return "";
        
    }
}
