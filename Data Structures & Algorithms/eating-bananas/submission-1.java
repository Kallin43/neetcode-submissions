class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int i = 0; i<piles.length; i++){
            right = Math.max(right, piles[i]);
        }
        int result = right;
        while(left<=right){
            int k = (right+left)/2;
            int hours = 0;
            for(int i = 0; i<piles.length; i++){
                hours += (piles[i] + k - 1)/k;
            }
            if(hours<=h){
                right = k - 1;
                result = k;
            }
            else{
                left = k + 1;
            }
        }
        return result;
    }
}
