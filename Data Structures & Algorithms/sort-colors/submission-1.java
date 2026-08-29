class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int r = 0;
        int w = 0;
        int b = n - 1;
        while(w<=b){
            if(nums[w]==0){
                int temp = nums[r];
                nums[r] = nums[w];
                nums[w] = temp;
                r++;
                w++;
            }
            else if(nums[w]==1){
                w++;
            }
            else{
                int temp = nums[b];
                nums[b] = nums[w];
                nums[w] = temp;
                b--;
            }
        }
    }
}