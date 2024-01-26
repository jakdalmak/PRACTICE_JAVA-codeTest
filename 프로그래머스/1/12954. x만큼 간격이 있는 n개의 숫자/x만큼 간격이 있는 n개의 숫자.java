import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        
        long[] answer = new long[n];
        
        Arrays.fill(answer, x);
        // x씩 증가하는 숫자.
        
        
        for(int i = 1; i <= n; i++) answer[i-1] *= i;
        return answer;
    }
}