import java.util.*;

class Solution {
    public int solution(String A, String B) {
        // 최소횟수 (0 ~ n) 또는 -1(불가능한 경우)을 return하기
        // 미는 경우는 오직 오른쪽으로만 민다.

        // 1] String[]을 사용해서 각 글자별로 나누고, 한 번 만들어진 배열마다 각 문자열 상태 확인하는 플로우 짜기.
        // 2] charAt으로 마지막 글자 추출 && subString으로 마지막 글자 제외 String 추출
        //    마지막 + 나머지 String을 비교 하는 식도 가능할듯?
        // => 후자를 채용해보기. String[]을 만드는 시점에서, for문을 더 돌려야하니까...
        // StringBuilder 사용하기?

        ArrayList<String> list = new ArrayList<>(Arrays.asList(A.split("")));
        int count = 0;

        for(int i = 0; i < A.length(); i++) {
            String testStr = String.join("", list);
            if(testStr.equals(B)) return count;
            
            list.add(0, list.remove(list.size() - 1));
            count++;
        }

        count = -1;

        return count;
    }
}