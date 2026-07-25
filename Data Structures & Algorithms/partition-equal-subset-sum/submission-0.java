class Solution {
    public boolean canPartition(int[] nums) {
        int totalsum = 0;
        for(int i = 0; i<nums.length; i++){
            totalsum += nums[i];
        }
        if(totalsum%2!=0){
            return false;
        }
        int target = totalsum/2;
        boolean[] dp = new boolean[target+1];
        dp[0] = true;
        for(int num:nums){
            for(int i = target; i>=num; i--){
                if(dp[i-num]){
                    dp[i] = true;
                }
            }
        }
        return dp[target];
    }
}
