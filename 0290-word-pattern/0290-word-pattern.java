class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n = pattern.length();
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.strip().split(" ");
        if(n != arr.length) return false;

        for(int i=0; i<n; i++){
            String cur = arr[i];
            char ch = pattern.charAt(i);
            if(!map.containsKey(ch) && !map.containsValue(cur)){
                map.put(ch,cur);
            }else if(map.containsValue(cur) && !map.containsKey(ch)) return false;
            else if(!map.get(ch).equals(cur)) return false;
            
            
        }
        return true;
    }
}