import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            // 같은 경우에 대한 별도 처리 필요하므로 아래와 같이 작성하였음.

            /*
            * 1 반환: 첫 번째 객체(o1)가 두 번째 객체(o2)보다 크다. 두 객체의 우선순위를 바꿈.
            * -1 반환: 첫 번째 객체(o1)가 두 번째 객체(o2)보다 작다. 두 객체의 순서를 그대로 유지.
            * */


            /** 절댓값이 더 작은 값이 앞에 위치하여야 함. */
            if(Math.abs(o1 - n) < Math.abs(o2 - n)) return -1; // o1이 더 작음.
            else if(Math.abs(o1 - n) > Math.abs(o2 - n)) return 1;

            /** 더 큰 값이 앞에 위치하여야 함. */
            if(o1 > o2) return -1;
            else return 1;
        });

        for(int num : numlist) {
            queue.add(num);
        }

        int[] answer = new int[numlist.length];
        int index = 0;


        while(queue.size() != 0) {
            answer[index++] = queue.poll();
        }

        return answer;
    }
}