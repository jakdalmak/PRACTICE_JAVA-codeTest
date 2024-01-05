import java.util.*;

class Solution {
    public int solution(String my_string) {
        
        
        Queue<String> queue = new LinkedList<>(Arrays.asList(my_string.split(" ")));
        
        int answer = Integer.parseInt(queue.poll()); // 첫 번째 피연산자를 미리 삽입해둠
        
        while(!queue.isEmpty()) {
            String operator = queue.poll();
            
            answer += operator.equals("+") ? // 연산자가 +인경우 그대로, -인경우 -1을 곱한 값을 더함.
                Integer.parseInt(queue.poll()) : Integer.parseInt(queue.poll()) * -1;
        }
        
        return answer;
    }
}