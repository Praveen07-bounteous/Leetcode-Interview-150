class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length(), i = 0, j = 0;
        while(j < m){
            if(i == n) return true;
            if(t.charAt(j) == s.charAt(i)) i++;
            j++;
        }
        if(i == n) return true;
        return false;
    }
}