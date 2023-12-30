class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
         
        if(direction.equals("left")) {
            for(int i = 1; i <= numbers.length; i++) 
                answer[i - 1] = numbers[i % numbers.length];
        }
        
        // right는 위같이 단순 수식으로는 어떻게 구현 해야할지 모르겠음..
        if(direction.equals("right")) {
            int i = numbers.length-1;
            for(int index = 0; index < numbers.length; index++)
                answer[index] = numbers[i++ % numbers.length];
            
        }
        return answer;
    }
}