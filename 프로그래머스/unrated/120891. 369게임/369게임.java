class Solution {
    public int solution(int order) {
        int answer = 0;
        
        // 3 6 9 게임.
        // 주어진 order를 각 자리수별로 분해하여 3 6 9라는 수가 들어있는 경우에 박수 카운트 추가.
        // 그런데, 3 6 9는 3으로 나누거나 나머지하는 경우 1 또는 0 반환됨.
        // switch문 필요없이 수식으로 대체.
        
        // 각 자리수를 비교해야한다면, String으로 변경한다면?
        // 이 역시 반복문을 수행해야 할 것이므로, 시간 복잡도는 동일할 것 같다. 그냥 수식으로 해보자...
        
        while(order != 0) {
            int num = order % 10; // order의 1의 자릿수 추출
            order /= 10; // order의 1의 자릿수 제거
            
            if(num % 3 == 0 && num != 0) answer++; // 추출한 1의 자릿수 3, 6, 9 인경우.
        }
        
        
        return answer;
    }
}