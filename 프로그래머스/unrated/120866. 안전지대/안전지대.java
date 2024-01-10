class Solution {
    public int solution(int[][] board) {
        
        // 큰 보드 만들기(외곽 라인까지 따기 위함)
        int[][] largerBoard = new int[board.length+2][board[0].length+2];
        // 자바에서 생성된 배열의 기본 값은 0으로 채워져있으므로, Arrays.fill 사용하지 않아도 됨.
        
        // largerBoard에 board의 내용들을 기입하기
        for(int i = 0; i< board.length; i++) {
            System.arraycopy(board[i], 0, largerBoard[i+1], 0, board.length);
        }
        
        int answer = board.length * board[0].length;
        
        // 카운트 용도의 큰 보드에 폭탄이 존재하는 경우 카운트 수행하기.
        for(int i = 1; i < largerBoard.length - 1; i++) {
            for(int j = 1; j < largerBoard[0].length - 1; j++) {
                // largerBoard 값 변경해도 상관 없게끔 폭탄의 위치는 Board를 참조하기.
                // 이를 위해, i와 j를 다음과 같이 설계하였음.
                // 1] i, j는 1부터 보드크기-1까지만 확인. 이는 실제 보드의 크기와 동일한 크기이다.
                // 2] 라저보드는 표기를 위한 용도일 뿐, 늘어난 범위 내에는 폭탄이 없으므로 
                //    보드크기-1까지만 확인해도 문제없음.
                
                
                if(board[i-1][j-1] == 1) {
                    // 보드 순회 도중, 폭탄을 만나면 현재 폭탄 위치기준 -1, -1 ~ +1, +1까지 총 9 칸에 +1 수행
                    largerBoard[i-1][j-1] += 1;
                    largerBoard[i-1][j] += 1;
                    largerBoard[i-1][j+1] += 1;
                    
                    largerBoard[i][j-1] += 1;
                    largerBoard[i][j] += 1;
                    largerBoard[i][j+1] += 1;
                    
                    largerBoard[i+1][j-1] += 1;
                    largerBoard[i+1][j] += 1;
                    largerBoard[i+1][j+1] += 1;
                }
            }
        }
        
        for(int i = 1; i < largerBoard.length - 1; i++) {
            for(int j = 1; j < largerBoard.length - 1; j++) {
                if(largerBoard[i][j] > 0) answer--;
            }
        }
        
        return answer;
    }
}