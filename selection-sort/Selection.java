import java.util.Arrays;
class Selection{
    public static void main(String[] args){
        System.out.println("Fuck Java");
        int[] unsortedArray = {98,823423,74,6,25,4,43,23,133,20};
        System.out.println(Arrays.toString(Selection.selectionSort(unsortedArray)));
    }

    public static int[] selectionSort(int[] array){
        
        for(int i=0;i<array.length;i++){
            int minIndex = i;
            for(int j=i;j<array.length;j++){
                if(array[j]< array[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }


        return array;
    }
}