import java.util.Arrays;
public class Bubble{
    public static void main(String[] args){
        int[] unsortedArray = {39,95,27,67,31,44,92,60,82,5,62,55,23,11,22};
        int[] sortedArrayTest = {5,11,22,23,27,31,39,44,55,60,62,67,82,92,95};
        int[] sortedArray = bubbleSort(unsortedArray);
        System.out.println(Arrays.equals(sortedArrayTest,sortedArray));
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] bubbleSort(int[] array){
        
        for(int i=0; i < array.length; i++){
            for(int j = 0; j < array.length - 1 - i; j++){
                if (array[j]>=array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
            }
        }
    }
    return array;
}
}