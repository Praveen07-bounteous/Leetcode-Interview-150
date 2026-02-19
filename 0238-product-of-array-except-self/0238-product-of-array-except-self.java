class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, zeroCount = 0, n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                zeroCount++;
                continue;
            }
            if(zeroCount >= 2) return new int[n];
            prod *= nums[i];
        }
        if(zeroCount >= 2) return new int[n];
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                res[i] = prod;
            }else if(zeroCount == 1){
                continue;
            }else res[i] = (prod/nums[i]);
        }
        return res;
    }
}