class Solution {
    public String solution(String cipher, int code) {
        // code - 1 번째(인덱스 기준)의 문자들만 합쳐서 answer에 합쳐주면 된다.
        // charAt 활용하여 추출하고, answer에 기입하기.
        
        String answer = "";
        int index = code - 1;
        
        while(index < cipher.length()) {
            answer += cipher.charAt(index);
            index += code;
        }
        
        return answer;
    }
}