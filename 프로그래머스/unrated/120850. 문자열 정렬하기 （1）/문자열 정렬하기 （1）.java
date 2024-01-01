import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // ASCII 코드를 활용하여, 9 >= char - '0' >= 0에 해당하는 문자들만 별도의 배열에 배치한다.
        // 해당 배열을 sort 하는 것으로 정렬을 수행한다.
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
        
        return answer;
    }
}