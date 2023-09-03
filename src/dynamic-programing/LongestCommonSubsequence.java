/**
 * Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
 * For example, "ace" is a subsequence of "abcde".
 * A common subsequence of two strings is a subsequence that is common to both strings.
 */

 
public class LongestCommonSubsequence{

    public int lcs(String A, String B){
        int n = A.length();
        int m = B.length();
        int[][] dp = new int[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(i == 0 && j == 0){
                    if(A.charAt(i) == B.charAt(j)){
                        dp[i][j] = 1;
                    }
                }
                else if(i == 0){
                    if(A.charAt(i) == B.charAt(j)){
                        dp[i][j] = 1;
                    }
                    else{
                        dp[i][j] = dp[i][j-1];
                    }
                }
                else if(j == 0){
                    if(A.charAt(i) == B.charAt(j)){
                        dp[i][j] = 1;
                    }
                    else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
                else{
                    if(A.charAt(i) == B.charAt(j)){
                        dp[i][j] = dp[i-1][j-1]+1;
                    }
                    else{
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }
        }

        return dp[n-1][m-1];
    }

    public static void main(String[] args){
        String str1 = "abcde";
        String str2 =  "ace" ;

        String str3 = "abbcdgf";
        String str4 = "bbadcgf";

        String str5 = "aaaaaa";
        String str6 = "ababab";

        LongestCommonSubsequence solution = new LongestCommonSubsequence();
        System.out.println("Result For A = \"abcde\", B = \"ace\" : " + solution.lcs(str1, str2));
        System.out.println("Result For A = \"abbcdgf\", B = \"bbadcgf\" : " + solution.lcs(str3, str4));
        System.out.println("Result For A =  \"aaaaaa\", B = \"ababab\" : " + solution.lcs(str5, str6));
    }

}