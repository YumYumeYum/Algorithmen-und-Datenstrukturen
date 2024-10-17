import java.util.Arrays;

public class Sortierung{
    static void mergesort(Integer[] a){

        if(a.length > 1){
            Integer half_length = a.length / 2;     //rundet bei ungeraden Zahlen
            Integer[] firstHalf = new Integer[half_length];
            Integer[] secondHalf = new Integer[a.length - half_length];

            System.arraycopy(a, 0, firstHalf, 0, firstHalf.length);
            System.out.println(Arrays.toString(firstHalf));

            System.arraycopy(a, half_length, secondHalf, 0, secondHalf.length);
            System.out.println(Arrays.toString(secondHalf));

            //sortieren
            



            //mergen
        }

        
    }
}

//e1, e2, e3 |index| e4, e5, e6
//        <--   i   -->