class Solution {
    public String solution(String letter) {
        String answer = "";
        // 아스키코드를 모르면 멍청하게 푸는 문제..
        // switch에 너무 매몰되어 생각하지 않기.
        
        String[] morseArr = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."};
        
        
        String[] letterArr = letter.split(" ");
        
        for(String oneLetter : letterArr) {
            for(int j = 0; j < morseArr.length; j++) {
                if(oneLetter.equals(morseArr[j])) answer += (char)(j+97); 
            }
        }
        
        return answer;
    }
}
