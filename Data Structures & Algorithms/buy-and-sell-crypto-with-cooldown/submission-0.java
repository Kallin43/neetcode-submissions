class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;
        int[] hold = new int[n];
        int[] rest = new int[n];
        int[] cool = new int[n];
        hold[0] = -prices[0];
        rest[0] = 0;
        cool[0] = 0;
        for (int i = 1; i < n; i++) {
            hold[i] = Math.max(hold[i - 1], rest[i - 1] - prices[i]);
            cool[i] = hold[i - 1] + prices[i];
            rest[i] = Math.max(rest[i - 1], cool[i - 1]);
        }
        return Math.max(rest[n - 1], cool[n - 1]);
    }
}
