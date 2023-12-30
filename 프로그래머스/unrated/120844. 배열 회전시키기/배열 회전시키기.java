import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
         
        if(direction.equals("left")) {
            for(int i = 1; i <= numbers.length; i++) 
                answer[i - 1] = numbers[i % numbers.length];
        }
        
        // right는 어떻게 해야할지 모르겠음..
        List<Integer> list = new ArrayList<>();
        if(direction.equals("right")) {
            int i = numbers.length-1;
            while(list.size() != numbers.length) {
                list.add(numbers[i % numbers.length]);
                i++;
            }
            
            i = 0;
            for(int index : list) {
                answer[i++] = index; 
            }
            
        }
        
        
        return answer;
    }
}