public class PowerFunctions{
    public static double power(double x, int n){

        if(x == 0 && n == 0){
            System.out.println("Versuch es erst garnicht");
            return 0;
        }

        double ans = x;
        for(int i = 0; i < n-1; i++){
            ans *= x;
        }

        return ans;
    }

    public static double fastPower(double x, int n){
        double ans = x;
        /*
        zukuenfitiger Max... wenn du das hier findest schlag dir so fest du kannst gegen
        gegen dein Kopf! Du hast 1 1/2h damit verbracht zu checken das n ein int ist
        und kein double. Du dachtest das Squar and Multiply deswegen hier nicht funktionieren kann...
        */
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(PowerFunctions.power(2, 3));
        
    }
}