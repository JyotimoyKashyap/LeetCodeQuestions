import java.util.HashMap;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int key){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            if(hashMap.containsKey(current) && (Math.abs(i-hashMap.get(current)) <= key)){
                return true;
            }else{
                hashMap.put(current, i);
            }
        }
        return false;
    }

    public static void main(String[] args){
        ContainsDuplicateII duplicateII = new ContainsDuplicateII();
        int[] array = {1,2,3,1};
        int key = 3;

        System.out.println(duplicateII.containsNearbyDuplicate(array, key));
    }
}
