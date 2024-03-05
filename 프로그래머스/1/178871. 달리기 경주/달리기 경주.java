import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> resultMap = new HashMap<>(); // 정답을 도출하기 위해 순서를 변경할 map
        Map<Integer, String> rankMap = new HashMap<>(); // 인원 참조를 위한 map

        String[] answer = new String[players.length];
        int rank = 1;

        // map 설정
        for(String player : players) {
            resultMap.put(player, rank); // 각 반복마다 변경되어 정답을 도출하는 map
            rankMap.put(rank++, player); // 각 반복마다 변경되어 정답 도출을 '돕는' map
        }


        // map의 value 순서를 변경. 이후 value대로 정렬하여 array 순서 확인.
        for(String caller : callings) {
            int callerRank = resultMap.get(caller);
            int changeRank = callerRank - 1;

            String changer = rankMap.get(changeRank);

            // 정답을 위한 값 변경
            resultMap.replace(caller, changeRank); // 추월한 순위
            resultMap.replace(changer, callerRank); // 추월당한 순위


            // 다음 반복에서의 참조를 위한 랭크 변경
            rankMap.replace(changeRank, caller);
            rankMap.replace(callerRank, changer);
        }

        for(int i = 1; i <= rankMap.size(); i++) {
            answer[i-1] = rankMap.get(i);
        }

        return answer;
        
        
        
        // List의 indexOf를 사용하는 경우, 시간 문제로 인해 본 문제를 통과할 수 없다.
        // List가 아닌, 다른 방법을 사용하여 선수들을 찾아내기. -> map을 사용하라!
        /*
        List<String> playList = new ArrayList<>(Arrays.asList(players));
            // Arrays.stream(players).collect(Collectors.toList());

        for (String call : callings) {
            int callerIdx = playList.indexOf(call); // indexOf로 인해 시간 문제가 발생한다??
            int changeIdx = callerIdx - 1;
            
            
            Collections.swap(playList, callerIdx, changeIdx);
//             String temp = playList.get(changeIdx);
            
//             playList.set(changeIdx, playList.get(callerIdx));
//             playList.set(callerIdx, temp);
        }

        String[] answer = playList.toArray(new String[playList.size()]);
        // toArray()에 어느 형식 Array인지, 그 크기는 얼마인지를 매개변수로 삽입해줄 것.

        return answer;
        */
    }
}