class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        // 가장 처음 나타나는 자리에 대해 확인해야함.
        // 좌측부터 확인하므로, 1의 자리부터 확인하는 식의 수식은 사용 불가능

        
        String numStr = Integer.toString(num);
        answer = numStr.indexOf(String.valueOf(k));
        
        answer = answer != -1 ? answer+1 : answer;
        return answer;
    }
}