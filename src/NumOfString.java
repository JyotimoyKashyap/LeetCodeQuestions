import java.util.HashMap;

public class NumOfString {

    public int numOfStrings(String[] patterns, String word){

        int res = 0;

        for(int i=0; i<patterns.length; i++){
            String pattern = patterns[i];
            if(word.contains(pattern)){
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args){

    }
}
