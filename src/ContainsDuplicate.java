import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums){
        boolean result = false;
        // using hashmap
        Set<Integer> duplicates = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            boolean value = !duplicates.add(nums[i]);
            if(value){
                return value;
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 4, 2};
        ContainsDuplicate duplicate = new ContainsDuplicate();
        System.out.println(duplicate.containsDuplicate(arr));
    }
}
