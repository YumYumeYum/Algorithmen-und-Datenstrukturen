public class PowerFunctions{

    private static Counter countPower = new Counter();
    private static Counter countFastPower = new Counter();
    //es kann nicht in counter erzeugt werden da es in PowerFunctions private ist

    public static void resetCounters(){      //setzt beide Zaehler auf 0 zurueck.
        countPower.reset();
        countFastPower.reset();
    }

    public static int getCountPower(){      //liefert den Zaehlerstand von countPower
        return countPower.get();
    }

    public static int getCountFastPower(){      //liefert den Zaehlerstand von countFastPower
        return countFastPower.get();
    }

    public static double power(double x, int n){

        if(x == 0 && n == 0){
            System.out.println("Versuch es erst garnicht");
            return 0;
        }

        double ans = 1.0;       //answer
        for(int i = 0; i < n; i++){
            ans *= x;
            countPower.increment();
        }

        return ans;
    }

    public static double fastPower(double x, int n){
        double ans = 1;

        while(n > 0){ 
            int last_bit = (n & 1); 

        if (last_bit > 0){ 
            ans = ans * x;
        } 
        
        x = x * x; 

        // Right shift 
        n = n >> 1; 
        countFastPower.increment();
    }  


        return ans;
    }
    public static void main(String[] args) {

        System.out.println("power = " + PowerFunctions.power(2, 23));
        System.out.println("fastPower" + fastPower(2,23));   

        System.out.println("count Power = " + countPower.get());
        System.out.println("count fast Power = " + countFastPower.get());
    }
}