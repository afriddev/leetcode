class Solution {
    public String addBinary(String a, String b) {

        int length = 0;
        if (a.length() >= b.length()) {
            length = a.length();
        } else {
            length = b.length();
        }

        int carry = 0;
        String result = "";

        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;

        for (int index = length - 1; index >= 0; index--) {
            int value1 = 0;
            int value2 = 0;

            try {
                value1 = Integer.parseInt(String.valueOf(a.charAt(aIndex)));
            } catch (Exception e) {
            }
            try {
                value2 = Integer.parseInt(String.valueOf(b.charAt(bIndex)));
            } catch (Exception e) {
            }

            if (value1 + value2 + carry ==  2) {
                carry = 1;
                result = "0" + result;

            }
            else if(value1 + value2 + carry == 3){
                carry = 1;
                result = "1" + result;
            }
            
             else {
                result = Integer.toString(value1 + value2 + carry) + result;
                carry = 0;
            }

           
                aIndex--;
            
            
                bIndex--;
            
        }

        if(carry >  0){
            result = Integer.toString(carry) + result; 
        }


        return result;

    }
}
