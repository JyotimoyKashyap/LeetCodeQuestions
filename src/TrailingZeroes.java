import java.util.Arrays;

public class TrailingZeroes {

    public int trailingZeroes(int n){
        int res = 0;
        for(int i=5; i<=n; i *= 5) {
            res = res + Math.floorDiv(n, i);
        }
        return res;
    }
}
