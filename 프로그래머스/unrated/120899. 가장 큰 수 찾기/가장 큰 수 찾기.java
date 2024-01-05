class Solution {
    public int[] solution(int[] array) {
        
        
        int large = 0;
        int index = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(large < array[i]) {
                large = array[i];
                index = i;
            }
        }
        
        int[] answer = {large, index};
        
        return answer;
    }
}