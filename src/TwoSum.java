import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target){
        // our brute force approach is to find all possible pairs,
        // but we can improve the approach by using a Hashmap
        // here key is the number itself and the value is the index
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];

        // in one iteration we can check if the target - nums[i] == some no. in the hashmap
        for(int i=0; i<nums.length; i++){
            if(hashMap.containsKey(target - nums[i])){
                // if it contains the no. then we should break the loop
                // as there can be only 1 solution
                result[1] = i;
                result[0] = hashMap.get(target - nums[i]);
                break;
            }else{
                hashMap.put(nums[i], i);
            }
        }

        return result;
    }

    public static void main(String[] args){
        // test cases
        int[] arr = {2,7,11,15};
        int target = 9;

        // test case 2
        int[] arr1 = {};
        int target1 = 6;

        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(arr1, target1)));
    }
}
