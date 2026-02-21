class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for(int i=left; i<=right; i++){
            int count = Integer.bitCount(i);
            if(prime(count)) res++;
        }
        return res;
    }
    public boolean prime(int n){
        if(n == 1) return false;
        if(n == 2 || n == 3) return true;
        if((n&1) == 0) return false;
        for(int i=3; i<n; i+=2){
            if(n%i == 0) return false;
        }
        return true;
    }
}