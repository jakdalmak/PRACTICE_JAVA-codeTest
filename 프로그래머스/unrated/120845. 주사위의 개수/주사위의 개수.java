class Solution {
    public int solution(int[] box, int n) {
    
        // 주어진 값 n으로 가로, 세로, 높이를 나눈 값을 각각 곱하기.
        return (box[0] / n) * (box[1] / n) * (box[2] / n); 
    }
}