class Solution {
    public int solution(int[] array) {
        // 각 int 배열 내의 값별로 7이라는 숫자가 몇 번 들어가있는지 count하여야 함.
        // array를 순회하며 각 값에 대해 나머지 연산을 반복하는 것으로 count 할 수는 있겠지만...
        // 이중 for문을 사용하지 않는 방법은 없는가?
        
        
        /* for문 나누어서 해결한 방식 */
        String arrToStr = "";
        int answer = 0;
        
        for(int x : array) arrToStr += x; // string + int == string 처리.
        
        for(int i = 0; i < arrToStr.length(); i++) {
            if(arrToStr.charAt(i) - '7' == 0) answer++;
        } 
        
        
        return answer;
    }
}