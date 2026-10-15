class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[n*2];
        int k = 0;
        for(int i = 0; i<2; i++){
            for(int j = 0; j<n; j++){
                result[k] = nums[j];
                k++;
            }
        }
        return result;
    }
}