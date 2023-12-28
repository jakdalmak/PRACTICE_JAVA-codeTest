import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        // 값이 큰 것부터 1로 작성하도록 한다.
        // 반환할 배열을 작성해서 그 배열에 번째 작성하기
        int[] result = new int[emergency.length];
        Arrays.fill(result, 0);

        for(int i = 1; i <= result.length; i++) {
            int maxNum = 0;

            // 최대값 찾기
            for (int num : emergency) {
                if (maxNum < num) maxNum = num;
            }

            int index = 0;
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[j] == maxNum) {
                    maxNum = emergency[j];
                    index = j;
                }
            }
            // 최대값을 찾아 해당 값의 인덱스번째를 result에서 order 값으로 변환
            result[index] = i;

            emergency[index] = 0;
        }
        
        return result;
    }
}