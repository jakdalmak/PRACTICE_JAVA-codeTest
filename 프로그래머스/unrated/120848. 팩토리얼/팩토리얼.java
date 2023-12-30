import java.math.*;

class Solution {
    public int solution(int n) {
        int temp = 1, factorial = 1;
        
        
        while(temp <= n) {
            temp *= factorial;
            factorial++;
        }
        // 위처럼 수행 시, factorial 연산이 정답보다 한 번 더 수행되는 문제 있음.

        return factorial - 2;
    }

}