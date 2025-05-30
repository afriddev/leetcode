class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int resultI = target - 'a';
        for(char c : letters){
            if(c-'a' > resultI){
                return c;
            }
        }
        return letters[0]; 
    }
}
