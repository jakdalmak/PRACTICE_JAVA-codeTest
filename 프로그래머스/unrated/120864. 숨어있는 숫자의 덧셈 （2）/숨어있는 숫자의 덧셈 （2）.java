class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        // my_string = my_string.replaceAll("[A-z]", " ").trim();
        // => 숫자 사이에 공백이 여러 칸 들어가게 되므로 split 불가능.
        
        int Num = 0;
        for(int i = 0; i < my_string.length(); i++) {
            // 숫자를 만나면 Num 첫 값 할당
            // 숫자 다음 숫자면 Num 10 곱하고 그 뒤에 추가
            // 숫자 다음 문자면 현재 Num값을 answer에 더하고 Num 0으로 초기화
            // +) 문장이 숫자로 끝나는 경우 값을 합산하는 것도 추가해야함.
            
            int isChar = my_string.charAt(i) - '0';
            
            if(Num == 0 && (isChar >= 0 && isChar <= 9)) {
                Num = isChar;
            }
            else if(Num != 0 && (isChar >= 0 && isChar <= 9)) {
                Num = Num * 10 + isChar;
            }
            else if(Num != 0 && !(isChar >= 0 && isChar <= 9)) {
                answer += Num;
                Num = 0;
            }
        }
        answer += Num; // 마지막까지 집계된 Num을 추가해주기

        
        return answer;
    }
}