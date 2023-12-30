class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        // 돌리는 방식은 같다. 단지, 시작하는 인덱스에 차이가 있을 뿐이다.
        if(direction.equals("left")) {
            for(int i = 1; i <= numbers.length; i++) 
                answer[i - 1] = numbers[i % numbers.length];
        }
        
        if(direction.equals("right")) {
            int i = numbers.length-1;
            for(int index = 0; index < numbers.length; index++)
                answer[index] = numbers[i++ % numbers.length];
            
        }
        return answer;
    }
}
