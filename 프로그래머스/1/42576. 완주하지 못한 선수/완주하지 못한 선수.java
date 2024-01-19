import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 각 map에 각 배열 안에 있는 key의 개수를 저장하기.
        // 본 문제는 participant에만 존재하는 값을 찾으면 됨.
        // 배열 크기 차이는 무조건 1이다.
        // count를 수행하는 것이므로, 카운트 수가 다르거나 없는 경우를 찾으면 됨.
        
        
        Map<String, Integer> participantMap = new HashMap<>();
        Map<String, Integer> completionMap = new HashMap<>();
        
        
        
        for(int i = 0; i < participant.length; i++) {
            participantMap.put(participant[i], participantMap.getOrDefault(participant[i], 0) + 1);
            if(i < participant.length - 1) 
                completionMap.put(completion[i], completionMap.getOrDefault(completion[i], 0) + 1);
        }
        
        for(int i = 0; i < participant.length; i++) {
            if(completionMap.get(participant[i]) == null) return participant[i];
            
            if(completionMap.get(participant[i]).equals(participantMap.get(participant[i]))) continue;  
            else return participant[i];
        }
        
        return "";
    }
}