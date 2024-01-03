class Solution {
    public String solution(String my_string) {
        // 대소문자 변환 메소드가 있는걸로 알고있음.
        // 다만, ASCII 코드 익히는 김에 일부러 사용하지 않고 작성해보기.
        
        
        // [A - Z] == 65 ~ 90
        // [a - Z] == 97 ~ 122
        
        
        // my_string의 각 문자에 대해서...
        // 90보다 작거나 같은 char 수에는 32 더하기.
        // 97보다 크거나 같은 char 수에는 32 빼기.
        
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            int charInt = my_string.charAt(i); // char 형을 int 강제 형변환
            
            if(charInt >= 97) charInt -= 32;
            else if(charInt <= 90) charInt += 32;
            
            answer += (char)charInt; // int 형을 char 강제 형변환
        }

        return answer;
    }
}