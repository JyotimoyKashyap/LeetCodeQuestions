import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class FirstNegativeIntegerInSizeK {

    public int[] calculate(int[] nums, int windowSize){
        // Making a queue for FIFO logic
        Queue<Integer> queue = new ArrayDeque<>();

        // we have to make left pointer and right pointer
        int i=0, j=0, l=0;// left pointer --> i and right pointer --> j and k is for result array
        int[] result = new int[nums.length - windowSize + 1];

        if(nums.length > windowSize) {
            while (j < nums.length) {
                // if the numbers are less than 0 then it can be an answer
                if (nums[j] < 0) {
                    queue.add(nums[j]);
                }

                // if we haven't hit the window size then we need to increment j till then
                if (j - i + 1 < windowSize) {
                    j++;
                } else if (j - i + 1 == windowSize) {
                    // if we have hit the size then we want to get the answer
                    // but getting the answer has some conditions
                    // it might happen that there are no negative elements in that window size then
                    // the queue will not have any element
                    if (queue.size() == 0) {
                        result[l] = 0;
                    } else {
                        result[l] = queue.peek();

                        // increment i after that
                        if (nums[i] == queue.peek())
                            queue.poll();
                    }
                    i++;
                    j++;
                    l++;
                }
            }
        }else{
            return new int[]{-1};
        }



        return result;
    }

    public static void main(String[] args){
        FirstNegativeIntegerInSizeK sizeK = new FirstNegativeIntegerInSizeK();
        int[] nums = {12, -1, -7, 5, 8, -15, 30, 25, 45};
        int[] nums2 = {12, -1};
        System.out.println(Arrays.toString(sizeK.calculate(nums2, 3)));
    }
}
