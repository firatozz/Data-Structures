
package quicksort;

public class QuickSort {

    public static void main(String[] args) {
        
        int dizi[] = {23,398,34,100,57,67,55,320};
        
        QuickSort(dizi, 0, dizi.length-1);
        
        for(int i = 0; i < 8; i++)
            System.out.println(" "+ dizi[i]);
      
    }
    
    public static void QuickSort(int input[], int left, int right){
        if( left < right){
            int q = Partition(input, left, right);
            QuickSort(input, left, q-1);
            QuickSort(input, q+1, right);
        }
    }
    
    private static int Partition(int input[], int left, int right){
        int pivot = input[right];
        int temp;
        int i = left;
        for ( int j = left; j < right; j++){
            if( input[j] <= pivot){
                temp = input[j];
                input[j] = input[i];
                input[i] = temp;
                i++;
            }
        }
        
        input[right] = input[i];
        input[i] = pivot;
        return i;
    } 
    
}
