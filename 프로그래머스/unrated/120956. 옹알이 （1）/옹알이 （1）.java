class Solution {
    public int solution(String[] babbling) {
        String[] canSpeach = {"aya", "ye", "woo", "ma"};
        
        int answer = 0;
        
        
        for(String bab : babbling) {
            bab = bab.replaceAll("aya|ye|woo|ma", "1");
            bab = bab.replaceAll("1", "");
            if(bab.equals("")) answer++;
        }
        
        
        return answer;
    }
}