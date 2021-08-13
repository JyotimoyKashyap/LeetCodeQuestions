public class ArrayOfDoubledPairs {

    // the array length will always be even
    public boolean canReorderDoubled(int[] arr){
        boolean result = false;
        for(int i=0; i<arr.length; i++){
            if(arr[2 * i + 1] == 2 * arr[2 * i]){
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args){
        ArrayOfDoubledPairs doubledPairs = new ArrayOfDoubledPairs();
        int[] arr = {4,-2,2,-4};
        System.out.println(doubledPairs.canReorderDoubled(arr));
    }
}
