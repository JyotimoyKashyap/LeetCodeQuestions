public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c){
        int[][] res = new int[r][c];
        int[] m = new int[mat[0].length*mat.length];
        int n = mat[0].length;
        // mapping the 2-d array into 1-d array
        // M[i][j] = M[n*i + j] where n -> number of cols
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                m[n*i + j] = mat[i][j];
            }
        }


        // the 2-d array will be mapped
        for(int i=0; i<m.length; i++){
            res[i/c][i%c] = m[i];
        }

        return res;
    }


    public static void main(String[] args){

    }
}
