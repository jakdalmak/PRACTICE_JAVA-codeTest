import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        // n은 0보다 큰 값, numlist 원소 또한 0보다 큰 값이므로 나머지 연산에 문제 X
        return Arrays.stream(numlist).filter(m -> m % n == 0).toArray();
    }
}