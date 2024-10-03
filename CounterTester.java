public class CounterTester {
    public static void main(String[] args) {

        Counter a = new Counter();

        for(int i = 0; i < 10; i++){

            a.increment();

            if(i == 5 || i == 7){
                a.decrement();
            }
            System.out.println(a.get());

        }
        a.restore();
    }

}

//javac example.java    -compile in bytecode
//java example          -bytecode wird interpretiert und in runtime ausgefuert