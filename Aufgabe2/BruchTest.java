public class BruchTest{
    public static void main(String[] args){
        
        Bruch x = new Bruch(1,2);   //x = 1/2
        Bruch y = new Bruch(2, 3);  //y = 2/3


        y.add(x);
        System.out.println("y = " + y.get());      //y = 7/6


        x.e(10);
        System.out.println("anehaerung eulerische = " + x.get());
    }
}