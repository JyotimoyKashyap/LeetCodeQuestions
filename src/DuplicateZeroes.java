import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateZeroes {

    public void duplicateZeroes(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);

            if(arr[i] == 0){
                list.add(i+1, 0);
            }
            if(list.size() == arr.length)
                break;
        }

        for(int i=0; i<arr.length; i++){
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        DuplicateZeroes duplicateZeroes = new DuplicateZeroes();
        duplicateZeroes.duplicateZeroes(new int[]{1,2,3,0,0,4,5,0,8,8,5,0,4,5});
    }
}
