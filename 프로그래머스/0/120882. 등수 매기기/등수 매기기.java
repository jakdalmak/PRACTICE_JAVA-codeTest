import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        // score를 1차원 배열에 평균 점수를 저장한 배열로 변경하기.
        // 변경한 배열을 내림차순 정렬하기.
        
        // 평균값의 크고 작음에 따른 등수가 중요한 시점에서, 굳이 나누기까지 할 필요는 없음
        // 이용할 방법이 있나?
        // => 평균값은 실수형이므로, 정수형만 사용하는게 더 안전?
        
        // HINT ::
        // ArrayList의 indexOf()를 사용하기.
        // => 배열의 크기가 명확한 경우라고 해도, 콜렉션을 활용하는 경우 또한 생각하도록 하자.
        
        /* 평균 배열 작성하기 */
        ArrayList<Integer> average = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++) {
            average.add(score[i][0] + score[i][1]);
        }
        
        Collections.sort(average, Collections.reverseOrder());
        // average ArrayList를 내림차순 정렬하였음.
        
        int[] answer = new int[average.size()];
        
        for(int i = 0; i < average.size(); i++) {
            answer[i] = average.indexOf(score[i][0] + score[i][1])+1;
        }
        // indexOf()는 '먼저 만난 인덱스의 값'을 반환한다. 
        // 즉, 1등, 2등, 2등, 4등 점수처럼 나열되어있다면 첫 번째의 2등점수가 지닌 인덱스인 1을 반환.
        // 여기에 1을 더해준다면 공동 등수로 활용이 가능하다!!!
        

        return answer;
    }
}