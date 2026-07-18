/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals, (a, b) -> Integer.compare(a.end, b.end));
        int n = intervals.size();
        if (intervals == null || n == 0) {
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(intervals.get(0).end);
        for(int i = 0; i<n; i++){
            Interval current = intervals.get(i);
            if(pq.peek()<=current.start){
                pq.poll();
            }
            pq.offer(current.end);
        }
        return pq.size()-1;
    }
}
