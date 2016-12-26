
package bubblesort;

public class BubbleSort {
    
    public static void bubblesort(int []x){
        int n = x.length;
        int hold,j,temp;
        
        for(temp=0;temp<n-1; temp++){
            for(j=0; j<n-temp-1; j++){
                if(x[j]>x[j+1]){
                    hold = x[j];
                    x[j] = x[j+1];
                    x[j+1] = hold;
                }
            }
        }
    }

    public static void main(String[] args) {
         int n[] = {23, 398, 34, 100, 57, 67, 55, 320};
         
           bubblesort(n);
         
         for (int i = 0; i < n.length; i++) {
            System.out.println(" " + n[i]);
    }
    }
    
}
