class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        // (total / num) == result의 중간 값.
        // num이 홀수인 경우와 짝수인 경우를 찾아 별도의 처리 수행하기.
        
        
        double index = (double)total/(double)num - (double)num/2;
        
        for(int i = 0; i < num; i++) {
            answer[i] = (int)Math.ceil(index);
            index += 1.0;
        }
        
        
        return answer;
    }
}