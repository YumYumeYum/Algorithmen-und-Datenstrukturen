public class Bruch{

    private int zaehler;
    private int nenner;

    public Bruch(int zaehler, int nenner){
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public void add (Bruch added_obj){
        
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

        Bruch first_add = new Bruch(1, 1);
        add(first_add);

        for(int i = 1; i <= n; i++){
            temp_nenner *= i;

            Bruch new_obj = new Bruch(temp_zaehler, temp_nenner);
            add(new_obj);
        }

    }

}