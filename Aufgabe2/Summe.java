public class Summe{
    public static void main(String[] args){

        int n = 5;
        Bruch x = new Bruch(0, 1);

        for(int i = 1; i <= n; i++){
            Bruch add = new Bruch(1, i);
            x.add(add);
        }

        System.out.println("Summe für n = " + n + ": " + x.get());
    }
}

//falsches Ergebnis schau nochmal rüber