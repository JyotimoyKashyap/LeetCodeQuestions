public class MaximizingXor {

    public static int maximizingXor(int l, int r){
        int result = l;
        for(int i=l; i<=r; i++){
            result = result ^ i;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(maximizingXor(10, 15));
    }
}
