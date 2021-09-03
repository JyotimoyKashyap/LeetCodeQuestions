public class UniqueCharacter {

    /**
     * Find the two non-repeating elements in an array of repeating elements/ Unique Numbers 2
     */
    public int[] solution(int[] arr){
        // we will traverse through the array once
        // and then xor all the elements
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = (sum^arr[i]);
        }

        // to separate the elements into two halves in which both have unknown
        // we are separating the unknown based on their rightmost set bit because if we know that
        // if a bit is set then xor operation must have found the bits different
        // at that position. So dividing the group into two
        // in which one group will have the rightmost set bit
        // and another group which will not have it.
        // will divide our unknowns into two groups
        // in that two groups. if we perform xor operation again.
        // the no.s which are same will cancel out and as we have reduced
        // that to one unknown it will be easy to find

        // find the rightmost set bit
        int setBit = (sum & -sum);

        int a = 0, b = 0;
        // now we have to xor with the set bit to know which element
        // belongs to whom
        for(int i=0; i<arr.length; i++){
            if((setBit&arr[i])>0){
                a = (a^arr[i]);
            }else{
                b = (b^arr[i]);
            }
        }

        // this will give the desired answer
        return new int[]{a, b};
    }
}
