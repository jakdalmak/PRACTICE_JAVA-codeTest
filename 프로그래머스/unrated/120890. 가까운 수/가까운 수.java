import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {        
        // array1 - n, array2 - n ... 을 수행한 값의 각 절댓값을 비교하여, 가장 작은 차이를 지니는 array 인덱스를 반환하기.
        // 절댓값은 Math.abs()를 사용하면 된다.
        // 참고로, Math는 Static이 적용되어있어 라이브러리 임포트 없이 바로 사용 가능.
        
        
        // array 내의 모든 값들을 비교해야 하는 시점에서, for문을 사용하는 것은 필수적이다.(stream의 경우 제외)
        
        Arrays.sort(array);
        
        int previous = Math.abs(array[0] - n);
        int answerIndex = 0;
        
        for(int i = 1; i < array.length; i++) {
            if (Math.abs(array[i] - n) < previous) answerIndex = i;
            previous = Math.abs(array[i] - n); // 이전값 저장
        }
        
        // 가까운 수 여러개인 경우, 더 작은 수를 return한다.
        
        
        return array[answerIndex];
    }
}