class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length, cur = nums[0], count = 0;
        for(int i=0; i<n; i++){
            if(count == 0){
                cur = nums[i];
                count = 1;
            }
            else if(nums[i] == cur) count++;
            else{
                count--;
            }
        }
            return cur;
    }
}