class Solution {
    public int solution(int[] numbers, int k) {
        // k-1 번째 이동한 대상을 반환하기.
        // 나머지 연산을 이용하여 일종의 원형 리스트 구현.
        
        // for문을 사용하지 않고도 구할 수 있는 문제이다.
        // 두뇌 풀가동...
        
        
        return numbers[(2 * (k-1)) % numbers.length];
    }
}