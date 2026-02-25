class Solution {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> { 
            if (a[0] != b[0]) { 
                return a[0] - b[0]; 
                } else { 
                    return a[1] - b[1]; 
                    } });
        for(int a : arr){
            q.offer(new int[] {Integer.bitCount(a), a});
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = q.poll()[1];
        }
        return arr;
    }
}