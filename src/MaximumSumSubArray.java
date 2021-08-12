public class MaximumSumSubArray {

    public int maxSumSubArray(int[] array, int key){
        int maxSum = Integer.MIN_VALUE;

        // Here we have to use Sliding window technique for solving it in O(n) time
        int i=0, j=0; // Here i --> left pointer , j --> right pointer
        int sum = 0;
        while(j<array.length){
            sum += array[j];
           // System.out.println(sum);

            if(key == 0){
                return -1;
            }

            if(j-i+1 < key){
                j++;
            }else if(j-i+1 == key){
                maxSum = Math.max(maxSum,sum);
//                System.out.println(sum);
//                System.out.println(maxSum);
                sum -= array[i];
                i++;
                j++;
            }
        }


        return maxSum;
    }

    public static void main(String[] args){
        MaximumSumSubArray subArray = new MaximumSumSubArray();
        int[] array = {3, 6, 0, -1, -17, 8};
        int key = 6;
        System.out.println(subArray.maxSumSubArray(array, key));
    }
}
