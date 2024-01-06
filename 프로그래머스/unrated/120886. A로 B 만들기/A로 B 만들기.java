class Solution {
    public int solution(String before, String after) {
        // char 형으로 바꾸고, 26개 소문자 영어의 개수에 대해 저장하는 배열을 각각에 대해 제작하여 값 비교하기
        int answer = 1;
        
        int[] smallAlphaCount = new int[26];
        
        char[] charArr = (before + after).toCharArray();
        
        // 카운팅
        for(int i = 0; i < charArr.length; i++) {
            smallAlphaCount[(int) (charArr[i] - 'a')]++;
        }
        
        // 조건확인
        for(int count : smallAlphaCount) {
            if(count % 2 != 0 && count != 0) {
                answer = 0;
                break;
            }
        }

        return answer;
    }
}