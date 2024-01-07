class Solution {
    public String[] solution(String my_str, int n) {
        // substring 활용하기.
        // replaceFirst는 처음 만난 값부터 없앤다는 것 이용하기.
        
        /* 첫 번째 제출 답안. */
        String[] answer = new String[my_str.length() % n != 0 ?
                                     my_str.length() / n + 1 : my_str.length() / n];
        
        for(int i = 0; i < answer.length - 1; i++) {
            answer[i] = my_str.substring(0,n);
            my_str = my_str.replaceFirst(answer[i], "");
        }
        
        // 마지막번째는 0 ~ n까지 불가능하다. n까지 존재하는지 확실치 않음.
        answer[answer.length - 1] = my_str.substring(0);
        
        
        return answer;
    }
}