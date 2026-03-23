public class Solution {

    public void quickSort(int low,int high, int[] array){


        if(low < high){
            int pivotIndex = partition(low, high, array);
            quickSort(low, pivotIndex - 1, array);
            quickSort(pivotIndex + 1,high, array);
        }
        
    }

    public int partition(int low, int high,int[] array){
        int i = low - 1;
        for (int j = low ;j <  high;j++){

            if(array[j] < array[high]){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }
}
