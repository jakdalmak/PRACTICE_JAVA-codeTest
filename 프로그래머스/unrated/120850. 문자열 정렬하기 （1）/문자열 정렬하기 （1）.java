import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // ASCII 코드를 활용하여, 9 >= char - '0' >= 0에 해당하는 문자들만 별도의 배열에 배치한다.
        // 해당 배열을 sort 하는 것으로 정렬을 수행한다.
        
        
        // String 문제의 경우는 반드시 char[], string[]을 빌려야만 해결할 수 있는 경우가 아니다.
        // String.charAt() 이라는 메소드를 절대 잊지 말자.
        /*
        ArrayList<Integer> resultList = new ArrayList<>();

        char[] arr = my_string.toCharArray();

        for(char arrIndex : arr) {
            if(arrIndex - '0' >= 0 && arrIndex - '0' <= 9) {
                resultList.add(arrIndex - 48);
            }
        }

        Collections.sort(resultList);
        int[] answer = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++) answer[i] = resultList.get(i);
        */
        
        my_string = my_string.replaceAll("[a-z]", "");
        
        int[] answer = new int[my_string.length()];
        // replaceAll을 수행한 이후의 크기를 기준으로 결과 배열을 생성하기.
        
        for(int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.charAt(i) - '0';
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}