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

        double ans = 1.0;
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
            countFastPower.increment();
        } 
        
        x = x * x;

        n = n >> 1; 
        countFastPower.increment();
    }

        return ans;
    }

    public static void codeTest(){

        double avgPowerCount = 0;
        double avgFastPowerCount = 0;
        double avg_n = 0;

        for(int i = 1; i <= 10000; i++){
            double x = Math.random();
            int n = (int) (1000 * Math.random());

            power(x, n);
            fastPower(x, n);

            avg_n += n;
            avgFastPowerCount += getCountFastPower();
            avgPowerCount += getCountPower();

            resetCounters();
        }
        avg_n /= 10000;
        avgFastPowerCount /= 10000;
        avgPowerCount/= 10000;

        System.out.println("Durchschnittlicher Exponent = " + avg_n);
        System.out.println("Durchschnittlische Multiplikation FastPower = " + avgFastPowerCount);
        System.out.println("Durchschnittliche Multiplikation Power = " + avgPowerCount);
    }

    public static void main(String[] args) {

        System.out.println("power = " + PowerFunctions.power(2, 12));
        System.out.println("fastPower = " + fastPower(2,12));   

        System.out.println("count Power = " + countPower.get());
        System.out.println("count fast Power = " + countFastPower.get());
    }

}