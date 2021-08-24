import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfAnagrams {

    /**
     * This is a question of sliding window and can be solved in linear time
     * if done nicely
     */
    public int count(String s, String pattern){
        Map<Character, Integer> words = new HashMap<>();
        // put all the characters into the hashmap of the pattern string
        for(char c : pattern.toCharArray()){
            if(words.containsKey(c)){
                // get the count and increase it and the put it back
                int count = words.get(c);
                words.put(c, ++count);
            }else{
                words.put(c, 1);
            }
        }

        // distinct words count
        int distinctCount = words.size();
        int key = pattern.length();

        // now we have to init the i and j values
        int i=0, j=0; // here i --> left pointer and j --> right pointer
        char[] original = s.toCharArray();
        int result = 0;

        // running the while loop
        while(j<s.length()){
            if(j-i+1 < key){
                // before incrementing we have to check if the
                // element that we traversed is present in our map and if present then
                // we have to decrement its count
                // also we have to check distinct count
                // and if one distinct becomes zero then we have to
                // decrement that also.
                if(words.containsKey(original[j])){
                    int count = words.get(original[j]);
                    words.put(original[j], --count);
                    // checking if any letter became 0 in count
                    if(words.get(original[j]) == 0){
                        distinctCount--;
                    }
                }
                j++;
            }
            // next condition we have to check
            else if(j-i+1 == key){
                // if the window size hits means that we have our required length,
                // and we can look for answers which we will get from distinct count
                if(words.containsKey(original[j])){
                    int count = words.get(original[j]);
                    words.put(original[j], --count);
                    // checking if any letter became 0 in count
                    if(words.get(original[j]) == 0){
                        distinctCount--;
                    }
                }

                if(distinctCount == 0){
                    result++;
                }

                // now we have to slide the window and remove the calculation
                if(words.containsKey(original[i])){
                    int count = words.get(original[i]);
                    words.put(original[i], ++count);

                    if(count-1 == 0)
                        distinctCount++;
                }
                i++;j++;

            }
        }

        return result;

    }

    public static void main(String[] args){
        CountOccurrencesOfAnagrams anagrams = new CountOccurrencesOfAnagrams();
        String s = "abaabaasbqurof";
        String pattern = "abaa";
        anagrams.count(s, pattern);
    }
}
