class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int n = intervals.length;
        result.add(intervals[0]);
        for(int i = 1; i<n; i++){
            int[] current = intervals[i];
            int[] last = result.get(result.size()-1);
            if(last[1]>=current[0]){
                result.remove(result.size()-1);
                result.add(new int[]{last[0], Math.max(current[1], last[1])});
            }
            else{
                result.add(new int[]{current[0], current[1]});
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
