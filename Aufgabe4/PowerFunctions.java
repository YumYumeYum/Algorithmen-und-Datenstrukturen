public class PowerFunctions{

    private static int countPower;
    private static int countFastPower;

    public static double power(double x, int n){

        if(x == 0 && n == 0){
            System.out.println("Versuch es erst garnicht");
            return 0;
        }

        double ans = 1.0;       //answer
        for(int i = 0; i < n; i++){
            ans *= x;
            countPower++;
        }

        return ans;
    }

    public static double fastPower(double x, int n){
        double ans = 1;     //answer

        while(n > 0){ 
            int last_bit = (n & 1); 

        if (last_bit > 0){ 
            ans = ans * x;
            countFastPower++;
        } 
        
        x = x * x; 

        // Right shift 
        n = n >> 1; 
    }  


        return ans;
    }
    public static void main(String[] args) {

        System.out.println("power = " + PowerFunctions.power(2, 23));
        System.out.println("fastPower" + fastPower(2,23));   

        System.out.println("count Power = " +countPower);
        System.out.println("count fast Power = " + countFastPower);
    }
}