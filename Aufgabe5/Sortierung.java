import java.util.Arrays;

public class Sortierung{
    static void mergesort(Integer[] a){

        if(a.length > 1){
            Integer half_length = a.length / 2;     //rundet bei ungeraden Zahlen
            Integer[] left = new Integer[half_length];
            Integer[] right = new Integer[a.length - half_length];

            System.arraycopy(a, 0, left, 0, left.length);
            System.out.println(Arrays.toString(left));

            System.arraycopy(a, half_length, right, 0, right.length);
            System.out.println(Arrays.toString(right));

            mergesort(left);
            mergesort(right);

            merge(left, right);

        }
    }

    static Integer[] merge(Integer[] left, Integer[] right){


        //initialisierung
        int arr_length = left.length + right.length;
        int i = 0;
        int j = left.length;
        Integer[] merged_Array = new Integer[arr_length];

        //Logik


        return merged_Array;
    }

    
}

//e1, e2, e3 |index| e4, e5, e6
//        <--   i   -->

/*commit Nachricht:
change array name: left,right naming(first,second before),



*/