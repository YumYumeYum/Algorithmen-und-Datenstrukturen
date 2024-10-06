import java.util.HashMap;
import java.util.Map;

public class Textanalyse{

    private int string_count;
    private String[] args;
    private int[] length;

    public Textanalyse(int string_count, String[] args){
        this.string_count = string_count;
        this.args = args;
    }

    public int[] string_length(){
        this.length = new int[string_count];

        for(int i = 0; i < string_count; i++){
            this.length[i] = args[i].length();

            //System.out.println(this.length[i]);
        }
        return this.length;
    }

    public Map<Character, Integer> char_count(){
        string_length();
        Map<Character, Integer> charCountMap = new HashMap<>();

        for(String arg : args){ //iteriert duch alle argumente

            for(int i = 0; i < arg.length(); i++){
                char letter = arg.charAt(i);
                letter = Character.toUpperCase(letter);

                charCountMap.putIfAbsent(letter, 0);
            
                charCountMap.put(letter, charCountMap.get(letter) + 1);
            }
        }
        return charCountMap;
    }

}

//java Textanalyse argument1 argument2 ...
//vlt Hashmap