import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> result;
        HashMap<String, Integer> sameString = new HashMap<>();
        int[] resultArray = new int[strs.length];
        int i=0;
        for(String s: strs){
            char[] sortedString = s.toLowerCase().toCharArray();
            Arrays.sort(sortedString);
            String compare = String.valueOf(sortedString);
            if(sameString.containsKey(compare)){
                resultArray[i]=sameString.get(compare);
            }else{
                sameString.put(compare, i);
                resultArray[i]=i;
            }
            i++;


        }


        int max = Integer.MIN_VALUE;
        for(int j=0; j<resultArray.length; j++){
            max = Math.max(max, resultArray[j]);
        }

        // then fill the arraylist with
        result = new ArrayList<List<String>>();
        for(int j=0; j<=max; j++){
            result.add(new ArrayList<String>());
        }



        // now to make the result list
        for(int j=0; j<resultArray.length; j++){
            List<String> getList = result.get(resultArray[j]);
            getList.add(strs[j]);
            result.remove(resultArray[j]);
            result.add(resultArray[j],getList);
        }


        result.removeIf(item-> item == null || item.size() == 0);


        return result;

    }

    public boolean isAnagram(String parent, String child){
        if(parent.length() != child.length())
            return false;
        else{
            char[] parentArr = parent.toLowerCase().toCharArray();
            char[] childArr = child.toLowerCase().toCharArray();
            Arrays.sort(parentArr);
            Arrays.sort(childArr);
            return Arrays.equals(parentArr, childArr);
        }
    }

    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagrams anagrams = new GroupAnagrams();
        System.out.println(anagrams.groupAnagrams(strs));
    }
}
