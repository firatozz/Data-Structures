package selectionsort;

public class SelectionSort {

    public static void main(String[] args) {
        int dizi[] = {23, 398, 34, 100, 57, 67, 55, 320};

        selectionsort(dizi, dizi.length);

        for (int i = 0; i < 8; i++) {
            System.out.println(" " + dizi[i]);
        }
    }

    public static int[] selectionsort(int[] x, int n) {

        int i, indx, j, large;
        for (i = 0; i < n; i++) {
            large = x[n - i - 1];
            indx = n - i - 1;
            for (j = 0; j < n - i; j++) {
                if (x[j] > large) {
                    large = x[j];
                    indx = j;
                }
            }
            x[indx] = x[n - i - 1];
            x[n - i - 1] = large;
        }
        return x;
    }

}
