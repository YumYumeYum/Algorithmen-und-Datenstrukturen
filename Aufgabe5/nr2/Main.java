public class Main {
    public static void main(String[] args) {
        BruchCompare[] brueche = {
            new BruchCompare(1, 2),
            new BruchCompare(3, 4),
            new BruchCompare(2, 3),
            new BruchCompare(5, 6),
            new BruchCompare(1, 3),
            new BruchCompare(-2, 5)
        };

        System.out.println("Unsortiert:");
        for (BruchCompare bruch : brueche) {
            System.out.println(bruch);
        }

        SortierungCompare.mergesort(brueche);

        System.out.println("\nSortiert:");
        for (BruchCompare bruch : brueche) {
            System.out.println(bruch);
        }
    }
}
