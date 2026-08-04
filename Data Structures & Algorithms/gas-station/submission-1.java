class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gassum = 0;
        for(int i = 0; i<gas.length; i++){
            gassum += gas[i];
        }
        int costsum = 0;
        for(int i = 0; i<cost.length; i++){
            costsum += cost[i];
        }
        if(gassum<costsum){
            return -1;
        }
        int tank = 0;
        int index = 0;
        for(int i = 0; i<gas.length; i++){
            tank += gas[i] - cost[i];
            if(tank<0){
                tank = 0;
                index = i + 1;
            }
        }
        return index;
    }
}
