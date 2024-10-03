public class RestrictedCounter extends Counter{

    private int max;


    public RestrictedCounter(int max){
        this.max = max;
    }

    @Override
    public void increment(){
        int temp = super.get();
        if(temp < max){
            super.increment();
        }

    }

    public int freeCapacity(){
        int temp = super.get();
        int diff = max - temp;
        
        return diff;
    }
}

//methode freeCapacity(); implementieren, zeigt die aktuellen freien plaetze an