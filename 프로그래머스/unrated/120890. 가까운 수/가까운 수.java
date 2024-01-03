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
        // 위의 조건을 만족하기 위해, 별도 배열을 만들거나 등을 통해 두 값의 크기 비교를 수행할 수도 있겠지만,
        // if 조건식이 '<' 로 작성되어있는 시점에서, 같은 차이값을 지니는 경우는 무시됨.
        // 즉, 배열이 정렬되어있다면 두 수중 작은 수가 저장된 시점에서 큰 수는 무시됨.
        // => 맨 처음에 Arrays.sort(array)를 수행하는 이유.
        
        
        return array[answerIndex];
    }
}