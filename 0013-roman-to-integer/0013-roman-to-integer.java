class Solution {
    public int romanToInt(String s) {
        int res = 0, n = s.length();
        boolean yo = true;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++){
            if(stack.isEmpty()) stack.push(s.charAt(i));
            else if(map.get(s.charAt(i)) <= map.get(stack.peek())) stack.push(s.charAt(i));
            else res += (map.get(s.charAt(i)) - map.get(stack.pop()));
        }
        while(!stack.isEmpty()) res += map.get(stack.pop());
        return res;
    }
}