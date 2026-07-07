class Solution {
    List<List<Integer>> result = new ArrayList<>();
    int[] nums;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        this.nums = nums;
        List<Integer> current = new ArrayList<>();
        backtrack(0,0,current, target);
        return result;
    }
    public void backtrack(int sum, int index, List<Integer> current, int target){
        if(sum==target){
            result.add(new ArrayList<>(current));
            return;
        }
        if(index==nums.length){
            return;
        }
        if(sum>target){
            return;
        }
        current.add(nums[index]);
        backtrack(sum+nums[index], index, current, target);
        current.remove(current.size()-1);
        backtrack(sum, index+1, current, target);
    }
}
