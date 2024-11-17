public class SortierungsbeispielCompare{
    public static void main(String[] args){
        Integer[] a= {15, 3, 8, 9, 20, 70, 4, 6};
        SortierungCompare.mergesort(a);
        System.out.print("a: ");
        for (int i=0; i<a.length; ++i)
        System.out.print(a[i] + " ");
        System.out.println();
    }
}