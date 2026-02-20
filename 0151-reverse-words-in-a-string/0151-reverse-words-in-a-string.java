class Solution {
    public String reverseWords(String s) {
        String[] arr = s.strip().split(" ");
        int n = arr.length;

        // for(int i=0; i<n/2; i++){
        //     String temp = arr[i];
        //     arr[i] = arr[n-i-1];
        //     arr[n-i-1] = temp;
        // }
        String res = "";
        for(int i=n-1; i>=0; i--){
            if(arr[i].equals("")) continue;
            res += arr[i];
            if(i != 0) res += " ";
        }
        return res;
   }
}