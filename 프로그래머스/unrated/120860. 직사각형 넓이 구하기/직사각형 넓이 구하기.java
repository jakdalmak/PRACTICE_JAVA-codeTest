import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        // 각각 두 점을 선택하고, 두 점이 같은 x 또는 y선상에 존재함을 증명해야함.
        
        // 두 개의 점을 선택할 때...?
        // A] 그냥 두 점을 선택하고, 대각선인 경우에 대해 별도 처리 작성하기.
        // => 애초에 대각선인 점을 선택했으면 끝이다!
        /* AA] 대각선인 점을 찾아 계산하기 => 이걸로 수행. */
        
        // B] 점을 선택할 때 애초에 같은 선상에 있는 경우만 선택하기.
        // => 복잡해..
        
        // C] 이차원 배열에 대한 Comparator를 작성하여 정렬 후 특정 인덱스만 잡아올리기.
        // => C안은 폐기. y좌표 에 대해서도 다시 sort를 수행해야함. 쓸데없이 복잡함...
        
        // Math.abs() == 절댓값 함수 활용하여 구한 길이값이 음수 도출되는 경우에 대해서도 해결하기.
        
        int answer = 0;
        int[] firstDot = dots[0];
        int[] secondDot = new int[2];
        
        
        for(int i = 1; i < dots.length; i++) {
            // 대각선에 위치한 점 찾기
            if(dots[i][0] != firstDot[0] && dots[i][1] != firstDot[1]) { 
                secondDot = dots[i];
                break;
            }
        }
        
        return Math.abs(
            (secondDot[0] - firstDot[0]) 
            * (secondDot[1] - firstDot[1])
        );
    }
}