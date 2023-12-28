class Solution {
    public String solution(String letter) {
        String answer = "";
        
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