import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Set<List<Integer>> duplicates = new HashSet<>();

        // looping through the array
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int value = - (nums[i] + nums[j]);
                List<Integer> solutionList = new ArrayList<>();
                if(hashMap.containsKey(value)){
                    if(hashMap.get(value) != j && hashMap.get(value) != i){
                        // then we can add the things in the list
                        solutionList.add(nums[i]);
                        solutionList.add(nums[j]);
                        solutionList.add(value);
                        Collections.sort(solutionList);
                        if(duplicates.add(solutionList)){
                            result.add(solutionList);
                        }
                    }
                }else{
                    hashMap.put(nums[j], j);
                }
            }
        }

        return result;
    }

    public List<List<Integer>> threeSumOptimised(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        // I need to run a loop
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || (i>0 && nums[i] != nums[i-1])){
                int lo = i+1, hi = nums.length - 1, sum =  - nums[i];
                while(lo<hi){
                    if(nums[lo] + nums[hi] == sum){
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));

                        while(lo<hi && nums[lo] == nums[lo+1])lo++;
                        while(lo<hi && nums[hi] == nums[hi-1])hi--;

                        lo++;hi--;
                    }
                    else if(nums[lo]+nums[hi]<sum)lo++;
                    else hi--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        ThreeSum threeSum = new ThreeSum();
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(Arrays.toString(threeSum.threeSumOptimised(arr).toArray()));
    }
}
