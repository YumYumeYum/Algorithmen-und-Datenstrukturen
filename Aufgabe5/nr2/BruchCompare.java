public class BruchCompare implements Comparable<BruchCompare> {

    private int zaehler;
    private int nenner;

    public BruchCompare(int zaehler, int nenner) {
        if (nenner == 0) {
            throw new IllegalArgumentException("Versuch es nochmal und ich ruf die Polizei");
        }
        if (nenner < 0) { 
            zaehler = -zaehler;
            nenner = -nenner;
        }
        int teiler = ggt(zaehler, nenner);
        this.zaehler = zaehler / teiler;
        this.nenner = nenner / teiler;
    }
    

    @Override       //Kreuzmultiplikation sagt Internet
    public int compareTo(BruchCompare other) {
        int thisProduct = this.zaehler * other.nenner;
        int otherProduct = other.zaehler * this.nenner;
        return Integer.compare(thisProduct, otherProduct);
    }

    public void add(BruchCompare addedObj) {
        this.zaehler = this.zaehler * addedObj.nenner + addedObj.zaehler * this.nenner;
        this.nenner = this.nenner * addedObj.nenner;

        int teiler = ggt(this.zaehler, this.nenner);
        this.zaehler /= teiler;
        this.nenner /= teiler;
    }

    public String toString() {
        return this.nenner == 1 ? String.valueOf(this.zaehler) : zaehler + "/" + nenner;
    }

    private int ggt(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public void e(int n) {
        this.zaehler = 0;
        this.nenner = 1;

        int tempZaehler = 1;
        int tempNenner = 1;

        this.add(new BruchCompare(1, 1));

        for (int i = 1; i <= n; i++) {
            tempNenner *= i;

            BruchCompare newObj = new BruchCompare(tempZaehler, tempNenner);
            this.add(newObj);
        }
    }
}
