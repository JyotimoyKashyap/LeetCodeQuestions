import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KSortedArray {

    public String isKSortedArray(int[] arr, int n, int k){
        // Here key is the element and the value is the index
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], i);
        }

        // after that sort the array
        Arrays.sort(arr);

        // next in a for loop we will see the difference
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                int index = map.get(arr[i]);
                if(Math.abs(index - i)>k){
                    return "No";
                }
            }
        }

        return "Yes";
    }

    public static void main(String[] args){
        KSortedArray kSortedArray = new KSortedArray();
        int[] arr = {13, 8, 10, 7, 15, 14, 12};
        int k = 1;
        int n = 7;
        System.out.println(kSortedArray.isKSortedArray(arr, n, k));
    }
}
