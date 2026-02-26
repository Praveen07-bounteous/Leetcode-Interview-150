class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length, i =0, j = 0;
        Set<Integer> set = new HashSet<>();

        while(j<n){
            while(Math.abs(i-j) > k){
                set.remove(nums[i]);
                i++;
            }
            if(set.contains(nums[j])) return true;
            else set.add(nums[j]);
            j++;
        }
        return false;
    }
}