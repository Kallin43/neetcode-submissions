class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int result = 0;
        while(left<right){
            int minheight = Math.min(heights[left], heights[right]);
            int temp = minheight * (right-left);
            if(temp>result){
                result = temp;
            }
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
}
