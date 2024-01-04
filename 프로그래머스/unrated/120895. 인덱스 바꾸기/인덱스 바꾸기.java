import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        // 각 문자를 바꾸어야 하므로, String[], char[] 등으로 바꾸어 변경해야한다.
        // 그러나, 본 문제는 해시를 이용하는 것을 권장하므로, 해시맵을 이용하여 해보기.
        // => 아무도 해시로 안풀었더라...
        /*
        Map<Integer, Character> map = new HashMap<>();

        for(int i = 0; i < my_string.length(); i++) {
            map.put(i, my_string.charAt(i));
        }

        char temp = map.get(num1);
        map.replace(num1, map.get(num1), map.get(num2));
        map.replace(num2, map.get(num2), temp);

        String answer = "";
        
        for(int i = 0; i < map.size(); i++) answer += map.get(i);
        return answer;
        
        */
        
        
        char[] charArr = my_string.toCharArray();
        
        charArr[num1] = my_string.charAt(num2);
        charArr[num2] = my_string.charAt(num1);
        
        String answer = String.valueOf(charArr);
        
        return answer;
    }
}