class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        // board는 언제나 홀수 크기다. 수식을 활용하여 x, y 좌표의 최대,최저값을 각각 구해두어야함.
        // keyinput에 따라 현재 플레이어의 좌표를 변경하되, x 및 y좌표의 최대 최저값을 넘기는 경우는 이동이 되지 않게해야함.
        // 서로 반대되는 up <-> down, left <-> right를 미리 계산해둔다면...?
        // => 보드의 크기가 한정되어있다.
        // l l l l l r l r l l l r과 실제적용될 l l l l r l r l r은 완전히 다른 결과를 보이기 때문에 불가능?
        
        int[] answer = {0,0};
        
        int[] maxToMin = {
            board[0] / 2, board[0] / 2 * -1, board[1] / 2, board[1] / 2 * -1 
        }; // x 최대, x 최소, y 최대, y 최소 저장.
        
        for(String input : keyinput) {
            if(input.equals("left") && answer[0] - 1 >= maxToMin[1]) {
                answer[0]--;
            }
            else if(input.equals("right") && answer[0] + 1 <= maxToMin[0]) {
                answer[0]++;
            }
            else if(input.equals("up") && answer[1] + 1 <= maxToMin[2]) {
                answer[1]++;
            }
            else if(input.equals("down") && answer[1] - 1 >= maxToMin[3]) {
                answer[1]--;
            }
        }
        
        
        return answer;
    }
}