class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch : arr) if(yo(ch)) sb.append(ch);
        String forward = sb.toString();
        String reversed = new StringBuilder(forward).reverse().toString();
        return forward.equals(reversed);
    }
    public boolean yo(char ch){
        if(ch >= 97 && ch <= 122) return true;
        int num = ch-'0';
        if(num >=0 && num <=9) return true;
        return false;
    }
}