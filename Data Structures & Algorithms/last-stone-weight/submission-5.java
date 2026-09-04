class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<stones.length; i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int n = pq.poll();
            int m = pq.poll();
            if(n==m){
                continue;
            }
            if(n>m){
                int x = n-m;
                pq.add(x);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.poll();
    }
}
