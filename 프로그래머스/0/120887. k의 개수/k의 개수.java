class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        
        for(int m = i; m < j+1; m++) {
            int num = m;
            while(num > 0) {
                int temp = num % 10;
                if(temp == k) answer++; 
                num /= 10;
            }
        }
        
        return answer;
    }
}