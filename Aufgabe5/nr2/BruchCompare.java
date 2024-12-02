public class BruchCompare implements Comparable<BruchCompare> {

    private int zaehler;
    private int nenner;

    public BruchCompare(int zaehler, int nenner) {
        if (nenner == 0) {
            throw new IllegalArgumentException("Versuch es nochmal und ich ruf die Polizei");
        }
        int teiler = ggt(zaehler, nenner);
        this.zaehler = zaehler / teiler;
        this.nenner = nenner / teiler;
        if (this.nenner < 0) { // Negative Brüche immer im Zähler speichern
            this.zaehler = -this.zaehler;
            this.nenner = -this.nenner;
        }
    }

    @Override
    public int compareTo(BruchCompare other) {
        // Vergleich durch Kreuzmultiplikation
        long thisProduct = (long) this.zaehler * other.nenner;
        long otherProduct = (long) other.zaehler * this.nenner;
        return Long.compare(thisProduct, otherProduct);
    }

    public void add(BruchCompare addedObj) {
        this.zaehler = this.zaehler * addedObj.nenner + addedObj.zaehler * this.nenner;
        this.nenner = this.nenner * addedObj.nenner;

        int teiler = ggt(this.zaehler, this.nenner);
        this.zaehler /= teiler;
        this.nenner /= teiler;
    }

    @Override
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
