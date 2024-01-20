import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // N/2 개수만큼 폰켓몬을 반드시 골라야 함.
        // 고른 폰켓몬의 종류 개수 최댓값을 리턴.
        // 경우의 수의 개수가 아닌, 말그대로 고를 수 있는 종류의 최대 개수를 리턴하면 됨!
        
        
        Map<Integer, Integer> ponketmonMap = new HashMap<>();
        
        for(int i : nums) ponketmonMap.put(i, ponketmonMap.getOrDefault(i, 0) + 1);
        
        
        if(ponketmonMap.size() <= nums.length/2) return ponketmonMap.size();
        else return nums.length/2;
            
    }
}