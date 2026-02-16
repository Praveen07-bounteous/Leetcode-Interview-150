class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0;
        List<Integer> list = new ArrayList<>();

        while(i < m && j < n){
            // if(nums1[i] == 0){
            //     i++;continue;
            // }
            // if(nums2[j] == 0){
            //     j++;continue;
            // }
            if(nums1[i] < nums2[j]){
                list.add(nums1[i]);
                i++;
            }else{
                list.add(nums2[j]);
                j++;
            }
        }
        while(i<m){
            // if(nums1[i] == 0){
            //     i++;continue;
            // }
            list.add(nums1[i]);i++;
        }
        while(j<n){
            // if(nums2[j] == 0){
            //     j++;continue;
            // }
            list.add(nums2[j]);j++;
        }

        int[] res = new int[list.size()];
        for(int k=0; k<list.size(); k++){
            nums1[k] = list.get(k);
        }
        // nums1 = res;
    }
}