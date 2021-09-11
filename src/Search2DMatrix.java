public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        // In a single for loop I can find the row at which the target
        // is present
        boolean res = false;
        int targetRow = -1;
        for(int i=0; i<matrix.length-1; i++){
            System.out.println("current : "  + matrix[i][0] + " forward : " + matrix[i+1][0]);
            if((target > matrix[i][0]) && (target < matrix[i+1][0])){
                targetRow = i;
                break;
            }
        }
        System.out.println(targetRow);
        if(targetRow == -1) return false;

        // now that I have got the target row I can search for
        // the element in O(n)
        for(int i=0; i<matrix[targetRow].length; i++){
            if(target == matrix[targetRow][i])
                res = true;
        }

        return res;
    }

    public static void main(String[] args){
        Search2DMatrix matrix = new Search2DMatrix();
        int[][] matrix2 = { {1,3,5,7},
                            {10,11,16,20},
                            {23,30,34,60} };
        System.out.println(matrix.searchMatrix(matrix2, 3));
    }
}
