import java.util.*;

class Solution {
    public long solution(String numbers) {
        // 본 문제는 '해시' 분류의 문제므로, 해시맵을 사용해서 풀어보기.
        Map<String, String> map = Map.of("zero", "0", "one", "1", "two", "2", 
                                         "three", "3", "four", "4", "five", "5",
                                         "six", "6", "seven", "7", "eight", "8", "nine", "9");
        
        for(String num : map.keySet()) {
            numbers = numbers.replace(num, map.get(num));
        }
        
        return Long.parseLong(numbers);
        
        
        /*
        numbers = numbers.replace("zero", "0");
        numbers = numbers.replace("one", "1");
        numbers = numbers.replace("two", "2");
        numbers = numbers.replace("three", "3");
        numbers = numbers.replace("four", "4");
        numbers = numbers.replace("five", "5");
        numbers = numbers.replace("six", "6");
        numbers = numbers.replace("seven", "7");
        numbers = numbers.replace("eight", "8");
        numbers = numbers.replace("nine", "9");
        
        long answer = Long.parseLong(numbers);
        
        return answer;
        */
        
    }
}