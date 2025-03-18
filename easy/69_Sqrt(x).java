class Solution {
   public int mySqrt(int x) {
        int index = 1;
        for (index = 1; index < x; index++) {
            if(x/index <= index) break;
        }

        if(x/index == index) return index;
        else return  index - 1;
    }
}
