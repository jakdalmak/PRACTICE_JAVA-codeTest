import java.util.*;

class Solution {
    public int solution(int[] sides) {
        // 피타고라스는 직각 삼각형에만 기준한다.
        // 본 문제는 그냥 삼각형의 조건만 생각해서 구해야됨!!
        
        // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 '''작아야''' 합니다.
        // ex. 1 1 2 => 2 == 1+1 => 불가능
        // ex. 1 2 3 => 3 == 1+2 => 불가능
        
        // 위 조건은 모든 삼각형에 대한 것이므로, 이등변 등 다양한 삼각형에 대해 걱정하지 않기.
        
        // sides가 오름차순 정렬되었다고 가정할 떄,
        // sides[0] + sides[1] > x > sides[1]-sides[0]를 만족하는 자연수 범위가 정답이다.
        // 범위 내 개수 == (sides[0] + sides[1]) - (sides[1] - sides[0]) - 1
        // == sides[0] * 2 - 1
        Arrays.sort(sides);
        return sides[0] * 2 - 1;
    }
}