package ınsertionsort;

public class InsertionSort {
    
       public static void insertsort(int x[], int n) {
        int i, k, y;
        for (k = 1; k < n; k++) {
            y = x[k];
            for (i = k - 1; i >= 0 && y < x[i]; i--) {
                x[i + 1] = x[i];
            }
            x[i + 1] = y;
        };
    }

    public static void main(String[] args) {
        int dizi[] = {23, 398, 34, 100, 57, 67, 55, 320};

        insertsort(dizi, dizi.length);

        for (int i = 0; i < dizi.length-1; i++) {
            System.out.println(" " + dizi[i]);
        }
    }

}
