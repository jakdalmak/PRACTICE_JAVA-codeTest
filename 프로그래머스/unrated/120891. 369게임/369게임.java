class Solution {
    public int solution(int order) {
        int answer = 0;
        
        // 3 6 9 게임.
        // 주어진 order를 각 자리수별로 분해하여 3 6 9라는 수가 들어있는 경우에 박수 카운트 추가.
        // 그런데, 0 3 6 9는 3으로 나누거나 나머지하는 경우 1 또는 0 반환됨.
        // 대신, 0에 대한 예외 조건 필요.
        
        // 각 자리수를 비교해야한다면, String으로 변경한다면?
        // 이 역시 반복문을 수행해야 할 것이므로, 시간 복잡도는 동일할 것 같다. 그냥 수식으로 해보자...
        /*
        while(order != 0) {
            int num = order % 10; // order의 1의 자릿수 추출
            order /= 10; // order의 1의 자릿수 제거
            
            if(num % 3 == 0 && num != 0) answer++; // 추출한 1의 자릿수 3, 6, 9 인경우.
        }
        */
        
        
        
        // 문자열 버전으로도 풀어보기.
        
        String orderStr = order + ""; // 숫자에 + ""를 수행해주면 별도의 String.valueOf()나 Integer.toString() 과 같은 메소드 사용하지 않아도 됨.
        
        for(int i = 0; i < orderStr.length(); i++) {
            if(orderStr.charAt(i) == '3' || orderStr.charAt(i) == '6' || orderStr.charAt(i) == '9') answer++;
        }
        
        
        
        
        return answer;
    }
}