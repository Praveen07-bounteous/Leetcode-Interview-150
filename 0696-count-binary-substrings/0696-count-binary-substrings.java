class Solution {
    public int countBinarySubstrings(String s) {
        char cur = s.charAt(0);
        int n = s.length(), count = 0, res = 0;
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(cur == s.charAt(i)){
                count++;
            }else{
                list.add(count);
                count = 1;
                cur = s.charAt(i);
            }
        }
        list.add(count);
        for(int i=0; i+1<list.size(); i++){
            res += Math.min(list.get(i), list.get(i+1));
        }
        if(list.size() == 1) return 0;
        return res;
    }
}