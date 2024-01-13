import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        /* 최초 코드 테스트까지 걸린 시간 : 1시간 0분 5초 */
        /* 최종 코드 제출까지 걸린 시간 : 1시간 47분 54초*/
        /* 정답까지 걸린 시간 : : 1시간 47분 54초 */
        
        int answer = 0;

        Map<String, Integer> giftScore = new HashMap<>();
        Map<String, Map<String, Integer>> giverMap = new HashMap<>();
        Map<String, Integer> nextMonthGiftCount = new HashMap<>();

        // giverMap의 key 인원이 takerMap의 key 인원에게 몇개의 선물 주었는지 기록.

        // 선물 지수와 다음달 선물받는 수 초기화하기.
        for(String friend : friends) {
            giftScore.put(friend, 0);
            nextMonthGiftCount.put(friend, 0);
        }

        // 제공내역 카운팅 && 선물지수 카운팅
        for(int m = 0; m < friends.length; m++) {

            /** 제공 내역 카운팅 */

            Map<String, Integer> innerMap = new HashMap<>();

            for(String friend : friends) innerMap.put(friend, 0);

            // gifts String[]을 보고 선물 지수 설정 및 선물 제공 내역 작성하기
            for (int i = 0; i < gifts.length; i++) {
                String[] trader = gifts[i].split(" "); // "a", "b"

                if(friends[m].equals(trader[0])) {
                    // 선물 제공내역 추가
                    innerMap.put(trader[1], innerMap.get(trader[1]) + 1);


                }
            }
            giverMap.put(friends[m], innerMap);



            /** 선물지수 카운팅 */
            int givePoint = 0;
            int takePoint = 0;

            for(int i = 0; i < gifts.length; i++) {
                String[] trader = gifts[i].split(" "); // "a", "b"

                if(trader[0].equals(friends[m])) givePoint++;
                if(trader[1].equals(friends[m])) takePoint++;


            }
            giftScore.put(friends[m], givePoint-takePoint);
        }


        // 선물 제공 내역 확인하며 각 인원이 다음달에 받을 선물의 개수 카운트 수행
        // 다음달에 받는 선물 중 가장 많은 수를 지니는 값을 count하기.
        for(String giver : giverMap.keySet()) {
            for(String taker : giverMap.keySet()) {
                int giverCount = giverMap.get(giver).get(taker);
                int takerCount = giverMap.get(taker).get(giver);


                int giverGiftScore = giftScore.get(giver);
                int takerGiftScore = giftScore.get(taker);


                // 이번 달에 준 선물이 더 많거나, 선물 지수가 더 높은 경우에만 다음달에 선물을 하나 받는다.
                if(giverCount > takerCount ||
                   (giverCount == takerCount && giverGiftScore > takerGiftScore) ) {
                    nextMonthGiftCount.put(giver, nextMonthGiftCount.get(giver) + 1);
                }

                if(answer < nextMonthGiftCount.get(giver)) answer = nextMonthGiftCount.get(giver);
            }
        }

        return answer;

    }

    
}