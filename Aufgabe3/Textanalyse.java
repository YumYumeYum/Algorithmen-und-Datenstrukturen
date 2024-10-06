public class Textanalyse{

    private int string_count;
    private String[] args;
    private int[] length;

    public Textanalyse(int string_count, String[] args){
        this.string_count = string_count;
        this.args = args;
    }

    public void string_length(){
        this.length = new int[string_count];

        for(int i = 0; i < string_count; i++){
            this.length[i] = args[i].length();

            System.out.println(this.length[i]);
        }
    }

    public void char_count(){
        string_length();
        int count;

        for(String arg : args){

            for(int i = 0; i < arg.length(); i++){

            }
        }
    }

}

//java Textanalyse argument1 argument2 ...
//vlt Hashmap