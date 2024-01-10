class Solution {
    public int solution(String my_string) {
        
        
        // my_string = my_string.replaceAll("[A-z]", " ").trim();
        // => 숫자 사이에 공백이 여러 칸 들어가게 되므로 split 불가능.
        // => regex의 사용 방식이 틀렸다! 공백 하나로 치환 되는 것이 맞음 => 2번 답안으로.
        
        /* 첫 번째 제출 답안 */
        /*
        int answer = 0;
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
        */
        
        
        /* 두 번째 제출 답안 */
        // " "와 같이 공백을 기준으로 split을 수행하게 되는 경우,
        // "123" "" "" "" "" "2323"... 과 같이 비어있는 문자열값을 배열이 지니게 된다.
        // 즉, 이 비어있는 문자열 값만 별도로 구분한다면, replaceAll - split 연계로 충분히 풀 수 있었던 문제.
        String[] splitStr = my_string.replaceAll("[a-zA-Z]", " ").trim().split(" ");
    
        int answer = 0;
        
        for(String str : splitStr) if(!(str.equals("")))answer += Integer.parseInt(str);
        
        return answer;
    }
}