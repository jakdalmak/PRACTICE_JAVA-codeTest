import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 2, max = 0, sum = 0;
        
        // 1. 가장 큰 값을 배열 순회를 통해 구한다.
        // 2. 나머지 두 값의 합 > 가장 큰 값 인 경우에만 삼각형을 제작할 수 있다.
        
        
        // 배열 최댓값 얻기
        // 오답노트 - sort를 수행하는 것으로 for 반복문 수행하지 않아도 됨.
        /*
        for(int i = 0; i < sides.length; i++) {
            if(max < sides[i]) max = sides[i];
            sum += sides[i];
        }
        if(sum - max > max) answer = 1;

        */
        
        Arrays.sort(sides);
        
        // 삼각형 제작이 가능한 경우 1로 변환하여 반환
        if(sides[0] + sides[1] > sides[2]) answer = 1;
        
        return answer;
    }
}