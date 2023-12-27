import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(num1 <= num2) {
            arr.add(numbers[num1]);
            num1++;
        }
        
        int[] answer = new int[arr.size()];
        int index = 0;
        
        for(int i : arr) {
            answer[index] = i;
            index++;
        }
        
        return answer;
    }
}