import java.util.Map;
public class TextTest {
    public static void main(String[] args){

        Textanalyse Textlogic = new Textanalyse(args.length, args);

        int[] arr = Textlogic.string_length();
        for(int i: arr){
            System.out.println(i);
        }

        System.out.println(Textlogic.char_count());

    }
}

//java Textanalyse argument1 argument2 ...