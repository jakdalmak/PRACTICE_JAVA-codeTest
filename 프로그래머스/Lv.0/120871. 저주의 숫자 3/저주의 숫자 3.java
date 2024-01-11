class Solution {
    public int solution(int n) {
        // 3 6 9 12 15 ... => x % 3 == 0
        // 3 13 23 33 ... 
        // 과 같이 3의 배수거나, 3이 들어간 숫자가 존재하는 경우 사용하지 않는다.
        
        
        // 이때, 3이 들어간 숫자의 경우, 1자리수씩 확인할 경우 for 반복문을 더 사용해야 하므로
        // 현재 숫자를 String으로 변환한 뒤, contains()를 사용하여 3이 존재하는지 확인하는 식으로 수행하자.

        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }
        return answer;
    }
}