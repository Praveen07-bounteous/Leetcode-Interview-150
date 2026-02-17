class Solution {
    String[] hours = {"8", "4", "2", "1", "0"};
    String[] minutes = {"32", "16", "08", "04", "02", "01", "00"};
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();
        
        for(int i=0; i<12; i++){
            for(int j=0; j<60; j++){
                if(Integer.bitCount(i) + Integer.bitCount(j) == turnedOn){
                    if(j<10){
                        res.add(i+":"+"0"+j);
                    }else res.add(i+":"+j);
                }
            }
        }
        return res;
    }
}