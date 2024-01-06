class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        // 앞의 연산 값이 마지막 값과 같은지 아닌지만 확인하면 됨.
        // 굳이 = 까지 따로 처리할 필요 없음
        
        for(int i = 0; i < quiz.length; i++) {
            // 큐를 쓰면 이중 반복문 사용하게됨(큐를 채우기 위해...)
            // 큐 없이 단일 반복문으로 수행해보기.
            
            String[] quizSplit = quiz[i].split(" ");
            int operResult = 0; // 계산 실셈값
            
            if(quizSplit[1].equals("+")) operResult = Integer.parseInt(quizSplit[0]) + Integer.parseInt(quizSplit[2]);
            else operResult = Integer.parseInt(quizSplit[0]) + Integer.parseInt(quizSplit[2]) * -1;
            
            int result = Integer.parseInt(quizSplit[4]); // 수식상 결과값
            
            // 기입 부문
            answer[i] = (operResult == result) ? "O" : "X";
        }
        return answer;
    }
}