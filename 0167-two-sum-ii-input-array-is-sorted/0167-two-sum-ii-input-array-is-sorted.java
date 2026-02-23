class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, n = numbers.length;
        int j = n-1;

        while(i<j){
            if(numbers[i]+numbers[j] == target) return new int[]{i+1,j+1};
            else if(target < numbers[i]+numbers[j]) j--;
            else if(numbers[i]+numbers[j] < target) i++;
        }
        return new int[]{};
    }
}