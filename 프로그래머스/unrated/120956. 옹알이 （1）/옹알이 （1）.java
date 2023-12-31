class Solution {
    public int solution(String[] babbling) {
        String[] canSpeach = {"aya", "ye", "woo", "ma"};
        
        int answer = 0;
        
        
        for(String bab : babbling) {
            bab = bab.replaceAll("aya|ye|woo|ma", "");
            if(bab.equals("")) answer++;
        }
        
        
        return answer;
    }
}