public class BruchCompare implements Comparable<brueche>{

    private int zaehler;
    private int nenner;

    public BruchCompare(int zaehler, int nenner){
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public int compareTo(BruchCompare bruchToCompare){

        return 0;
    }

    public void add (brueche added_obj){
        
        this.zaehler = this.zaehler * added_obj.nenner + added_obj.zaehler * this.nenner;
        this.nenner = this.nenner * added_obj.nenner;

        int teiler = ggt(this.zaehler, this.nenner);
        this.zaehler /= teiler;
        this.nenner /= teiler;
    }

    public String get(){

        if(this.nenner == 1)
            return "" + this.zaehler;

        return zaehler + "/" + nenner;
    }

    public int ggt(int a, int b){

        if(b > a)
            return (ggt(b,a));
        else
            return( (b==0) ? a : ggt(b, a%b));
    }

    public void e(int n){

        this.zaehler = 0;
        this.nenner = 1;

        int temp_zaehler = 1;
        int temp_nenner = 1;

        BruchCompare first_add = new BruchCompare(1, 1);
        add(first_add);

        for(int i = 1; i <= n; i++){
            temp_nenner *= i;

            BruchCompare new_obj = new BruchCompare(temp_zaehler, temp_nenner);
            add(new_obj);
        }

    }

}