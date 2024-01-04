import java.util.*;

class Solution {
    public String solution(String s) {
        // 한번만 등장한 문자를 알기 위해서는, 각 문자를 count 하여야 함.
        // count에 Map<Character, Integer>을 사용하도록 하자.
        // 이후 count된 값이 1인 문자들만 정렬하여 문자열에 추가하기.
        
        // map을 모든 영문 소문자를 셀 수 있게 만들기 => Map이 쓸데없이 너무 커짐
        // String에 별도 처리하여 distinct 결과값 얻어 Map에 설정하기
        // => Set 사용?
        
        /*
        Map<Character, Integer> map = new HashMap<>();
        
        String distinctedStr = "";
        String answer = "";
        
        for(int i =0; i < s.length(); i++) {
            if(i == s.indexOf(s.charAt(i))) {
                distinctedStr += s.charAt(i);
            }
        }
        
        for(char c : s.toCharArray()) {
            if(!map.containsKey(c)) {
                map.put(c, 1); // 처음나온 값인경우 맵에 추가
            }
            else {
                map.put(c, map.get(c) + 1); // 이미 존재하는 경우 밸류 증가
            }
        }
        
        Collections.sort(map); // 키 기준으로 소팅할 방법 찾아야 함
               
        for(char c : distinctedStr.toCharArray()) {
            if(map.get(c) == 1) answer+= c;
        }
        */
        
        
        
        String answer = "";
        
        ArrayList<Character> list = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++) {
            int count = 0;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) count++;
            }
            
            if(count == 1) list.add(s.charAt(i));
            
        }
        
        Collections.sort(list);
        
        for(char c : list) answer += c;
        
        return answer;
    }
}