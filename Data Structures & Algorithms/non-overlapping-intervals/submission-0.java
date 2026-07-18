class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[1],b[1]));
        int n = intervals.length;
        int result = 0;
        int[] prev = intervals[0];
        for(int i = 1; i<n; i++){
            int[] current = intervals[i];
            if(prev[1]>current[0]){
                result++;
                continue;
            }
            prev = current;
        }
        return result;
    }
}
