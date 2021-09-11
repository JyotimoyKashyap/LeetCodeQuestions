import java.util.*;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> res = new ArrayList<>();

        // initial base case
        res.add(List.of(1));

        // run for loop and add
        for(int i=1; i<numRows; i++){
            List<Integer> temp = new ArrayList<>(res.get(i - 1));
            List<Integer> tempRes = new ArrayList<>();
            temp.add(0,0);
            temp.add(temp.size(), 0);
            System.out.println(Arrays.toString(temp.toArray()));
            for(int j=0; j<temp.size()-1; j++){
                tempRes.add(temp.get(j) + temp.get(j+1));
            }
            res.add(tempRes);
        }

        return res;
    }

    public static void main(String[] args){
        PascalsTriangle triangle = new PascalsTriangle();
        System.out.println(triangle.generate(5));
    }
}
