public class PowerFunctionsTest{
    public static void main(String[] args) {

        double x = 0;
        int n = 0;

        double avgPowerCount = 0;
        double avgFastPowerCount = 0;
        double avg_n = 0;
        
        for(int i = 1; i <= 10000; i++){

            x = Math.random();
            n = (int)(1000 * x);

            System.out.println("slow " + i + " = " + PowerFunctions.power(x, n));
            System.out.println();
            System.out.println("fast " + i + " = " + PowerFunctions.fastPower(x, n)); 
            System.out.println("------------------------------------------");

            avgPowerCount += PowerFunctions.getCountPower(); 
            avgFastPowerCount += PowerFunctions.getCountFastPower();
            avg_n += n;
        }

        avgPowerCount = avgPowerCount/10000;
        avgFastPowerCount = avgFastPowerCount/10000;
        avg_n = avg_n/10000;

        System.out.println("durchschnitt Multiplikationen slow: " + avgPowerCount);
        System.out.println("durchschnitt Multiplikationen fast: " + avgFastPowerCount);
        System.out.println("durschnitt n = " + avg_n);

        System.out.println("slow count = " + PowerFunctions.getCountPower());
        System.out.println("fast count = " + PowerFunctions.getCountFastPower());
    }
}