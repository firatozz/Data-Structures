
package mergesort;

public class MergeSort {
    
    private int[] list;
    
    public MergeSort(int[] listToSort){ //List building function of the list
        list = listToSort;
    }
    
    public int [] getList(){ //Encapsulation function that returns the list
        return list;
    }
    
    public void sort(){ //Externally invoked sort function
        list = sort(list);
    }
    
    private int[] sort(int [] whole){ // Sort function used for recursive and each part
        
        if( whole.length == 1){
            return whole;
        }
        else{
            int [] left = new int [whole.length/2];
            System.arraycopy(whole, 0, left,0, left.length);
            int[] right = new int[whole.length - left.length];
            System.arraycopy(whole, left.length, right, 0, right.length);
            
            left = sort(left);
            right = sort(right);
            
            merge(left,right,whole);
            return whole;
        }
    }
    
    private void merge(int [] left, int [] right, int [] result){ //Merge function
        
        int x=0; int y = 0; int k = 0;
        
        while( x<left.length && y<right.length){
            if(left[x] < right[y]){
                result[k] = left[x];
                x++;
            }
            else{
                result[k] = right[y];
                y++;
            }
            
            k++;
        }
        
        int [] rest; int restIndex;
        
        if( x >= left.length){
            rest = right;
            restIndex = y;
        }
        else{
            rest = left;
            restIndex = x;
        }
        
        for( int i = restIndex; i < rest.length; i++){
            result[k] = rest[i];
            k++;
        }
    }
            
            
    public static void main(String[] args) {
       
        int [] arrayToSort = {15,19,4,3,18,6,2,12,7,9,11,16};
        System.out.println("Unsorted : ");
        for( int i = 0; i < arrayToSort.length; i++){
            System.out.println(arrayToSort[i] + " ");
        }
        
        MergeSort sortObj = new MergeSort(arrayToSort);
        sortObj.sort();
        System.out.println("Sorted : ");
        int [] sirali = sortObj.getList();
        for ( int i = 0; i<sirali.length; i++){
            System.out.println(sirali[i] + " ");
        }
    }
    
}
