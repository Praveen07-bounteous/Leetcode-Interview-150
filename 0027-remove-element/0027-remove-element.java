class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(nums[i] != val){
                count++;
                list.add(nums[i]);
            }
        }
        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }
        return count;
    }
}