class Solution {
    public int solution(int n) {
        // 3 6 9 12 15 ... => x % 3 == 0
        // 3 13 23 33 ... 
        // 과 같이 3의 배수거나, 3이 들어간 숫자가 존재하는 경우 사용하지 않는다.
        
        
        // 이때, 3이 들어간 숫자의 경우, 1자리수씩 확인할 경우 for 반복문을 더 사용해야 하므로
        // 현재 숫자를 String으로 변환한 뒤, contains()를 사용하여 3이 존재하는지 확인하는 식으로 수행하자.
        
        int answer = 1;
        int index = 0;
        while (index < n) {
            if(answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
                continue; 
                // 23 24와 같이, 3이 들어간 수 이후에 3의 배수가 나올 수 있음.
                // 마찬가지로, 12 13과 같이 3의 배수 이후에 3이 들어간 수가 나올 수 있음.
                // 이로 인해 값이 증가하면 조건식을 다시 확인하는 절차가 필요함. 이를 위해 continue 사용.
            } 
            index++;
            answer++;
        }
        
        
        return answer-1;
    }
}