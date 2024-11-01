import java.util.Arrays;

public class Sortierung{
    static void mergesort(Integer[] a){

        if(a.length > 1){
            int half_length = a.length / 2;     //rundet bei ungeraden Zahlen
            Integer[] left = new Integer[half_length];
            Integer[] right = new Integer[a.length - half_length];

            System.arraycopy(a, 0, left, 0, left.length);
            System.out.println("left = " + Arrays.toString(left));

            System.arraycopy(a, half_length, right, 0, right.length);
            System.out.println("right = " + Arrays.toString(right));

            mergesort(left);
            mergesort(right);

            merge(a, left, right, half_length,a.length - half_length );

        }
    }

    static void merge(Integer[] a, Integer[] left, Integer[] right, int mid, int end) {
 
        int i = 0, j = 0, k = 0;

        while (i < mid && j < end) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            }
            else {
                a[k++] = right[j++];
            }
        }
        while (i < mid) {
            a[k++] = left[i++];
        }
        while (j < end) {
            a[k++] = right[j++];
        }
        System.out.println("merge (a) = " + Arrays.toString(a));
    }
}