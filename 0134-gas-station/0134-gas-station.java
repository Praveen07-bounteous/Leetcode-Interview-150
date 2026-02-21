class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length, i = 0, max = Integer.MIN_VALUE, idx = 0, gas_sum = 0, cost_sum = 0;
        for(; i<n; i++){
            gas_sum += gas[i];
            cost_sum += cost[i];
        }
        if(cost_sum > gas_sum) return -1;
        i = 0;
        int currentGas = 0;
        for(; i<n; i++){
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                idx = i + 1;
            }
        }

        return idx;
    }
}