public class Sortierung{
    static void mergesort(Integer[] a){

        if(a.length == 1){
            return;
        }

        Integer half_length = a.length / 2;     //rundet bei ungeraden Zahlen
        Integer[] firstHalf = new Integer[half_length];
        Integer[] secondHalf = new Integer[a.length - half_length];


        
    }
}

//e1, e2, e3 |index| e4, e5, e6
//        <--   i   -->