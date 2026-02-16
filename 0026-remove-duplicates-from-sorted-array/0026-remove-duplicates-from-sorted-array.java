class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length, count = 0;
        for(int i=0; i<n; i++){
            if(nums[count] != nums[i]){
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;
    }
}