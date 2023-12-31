class Solution {
    public int solution(int n) {
        int answer = 0;
        // 주제 - 수학, 반복문 
        
        // 약수가 3개 이상 == 소수가 아닌 수를 의미한다.
        // 소수? == 1과 자기자신으로만 나눌 수 있는 수
        // 2부터 자기자신-1까지 반복문을 돌다가, 1번이라도 나머지연산이 0이 나오는 수가 있는 경우
        // 소수가 아닌 수로 판단
        
        
        // 시작지점을 2가 아닌 4부터 수행하는 것으로 작성하였음.
        // 합성수의 시작 지점은 4이므로, 의미없는 for문 반복 횟수 최대한 줄이기 위함.
        for(int i = 4; i <= n; i++) {
            if(i % 2 == 0) { 
                ++answer; 
                continue;
            }
            
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    ++answer;
                    break; // 현재 위치한 수 i는 합성수임이 판정되었으므로, 반복문 통과.
                }
            }
        }
        
        return answer;
    }
}