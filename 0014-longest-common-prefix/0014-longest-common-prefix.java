class Solution {
    public String longestCommonPrefix(String[] strs) {
       int n = strs.length, max = Integer.MAX_VALUE;
       String ans = "";
       for(String s : strs){
            if(s.length() < max){
                max = s.length();
                ans = s;
            }
       }

        for(String s : strs){
            while(!s.startsWith(ans)){
                ans = ans.substring(0, ans.length()-1);
                if(ans.equals("")) return "";
            }
        }

        return ans;
    }
}