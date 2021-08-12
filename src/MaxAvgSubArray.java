import java.text.Format;

public class MaxAvgSubArray {

    public double findMaxAverage(int[] nums, int k){
        int sum = 0, i=0, j=0;
        double maxAvg = Integer.MIN_VALUE, avg = 0;
        while(j<nums.length){
            sum += nums[j];
            avg = ((double) sum / (double) k);
            if(j-i+1 < k) j++;
            else if(j-i+1 == k){
                maxAvg = Math.max(maxAvg, avg);
                sum -= nums[i];
                i++;j++;
            }
        }
        return maxAvg;
    }

    public static void main(String[] args){
        MaxAvgSubArray subArray = new MaxAvgSubArray();
        int[] arr = {1,12,-5,-6,50,3};
        int key = 4;
        System.out.println(subArray.findMaxAverage(arr, key));
    }
}
