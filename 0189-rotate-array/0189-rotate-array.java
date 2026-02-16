class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        yo(nums, 0, n-1);
        k = k%n;
        yo(nums, 0, k-1);
        yo(nums, k, n-1);
    }
    private void yo(int[] nums, int i, int j){
        while(i<j){
            int tmp = nums[i];
            nums[i] = nums[j];        
            nums[j] = tmp;
            i++;j--;
	    }
    }
}