public class Counter {

    private int x; // Zählerstand
    private int temp;
    private boolean juergen;

    public Counter(){ // Konstruktor
        x = 0;
        temp = 0;
        juergen = false;
    }

    public void increment(){ // Hochzählen
        x++;
    }

    public int get(){ // Auslesen
        return x;
    }

    public void reset(){ // Zurücksetzen
        x = 0;
        juergen = false;    //zusatz fuer U1Nr.4
    }

    public void decrement(){
        if( x > 0 ){
            x--;
        }else{
            System.out.println("Couner is already at 0! Decrement is not possible");
        }
    }

    public void save(){
        temp = x;
        juergen = true;
    }

    public void restore(){
        if(juergen){
            x = temp;
        }
        System.out.println("restoring value is not possible, you have to safe a value before restoring is available!");
    }

}