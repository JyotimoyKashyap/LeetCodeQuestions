public class LongestPalindromicSubstring {

    /** Leetcode
     * Given a string s, return the longest palindromic substring in s.
     *
     * Example 1:
     *
     * Input: s = "babad"
     * Output: "bab"
     * Note: "aba" is also a valid answer.
     */

    public String longestPalindrome(String s){
        // we have to use dp here to actually solve the problem
        boolean[][] dp = new boolean[s.length()][s.length()];
        int start = 0;
        int end = 0;

        // filling the table with boolean values for palindromes
        for(int g = 0; g<s.length(); g++){
            for(int i = 0, j = g; j<s.length(); i++, j++){
                if(g == 0){
                    dp[i][j] = true;
                }else if(g == 1){
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                }else{
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                }

                if(dp[i][j]){
                    start = i;
                    end = j;
                }
            }
        }

        // I have to return the string
        return s.substring(start, end+1);
    }

    public static void main(String[] args){
        LongestPalindromicSubstring substring = new LongestPalindromicSubstring();
        System.out.println(substring.longestPalindrome("cbbd"));
    }
}
