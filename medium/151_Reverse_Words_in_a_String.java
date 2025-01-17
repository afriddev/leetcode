class Solution {
    public static String reverseWords(String s) {
         String[] splitedString = s.replaceAll(" ", "_").split("_");
        String result = "";
        for(int index = splitedString.length -1 ;index >=0;index--){
            if (splitedString[index].length() > 0) {
                if (result.length() > 0) {
                    result = result + " " + splitedString[index];
                }
                else{
                result = result  + splitedString[index];
                }
            }
            
        }
        return result;
    }
}
