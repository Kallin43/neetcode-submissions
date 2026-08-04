class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                String rev = new StringBuilder(sub).reverse().toString();
                if (sub.equals(rev)) {
                    dp[i][j] = true;
                    if (sub.length() > ans.length()) {
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }
}