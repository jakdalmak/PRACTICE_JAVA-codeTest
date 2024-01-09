import java.util.*;

class Solution {
    public String solution(String polynomial) {
        /* 슈도 코드 */
        // 덧셈만 수행하는 다항식에서 일차항 값과 상수항 값 구분하여 더하고 그 결과식을 String으로 표현하기
        // 동류항끼리 구분해야한다. => split(" + ")를 통해 일차적으로 나누기.
        // x가 존재하는 경우와 아닌 경우끼리 나누기. 이때 substring 통해서 일차항의 x 제외시키기.
        // 일차항 배열 총합 + "x + " + 상수항 배열 총합을 return하기.
        // 그냥 x인 경우에는... 계산중 == 1을 추가하기, 결과값이 x == 1을 x로 치환?

        String[] onlyTerm = polynomial.split(" \\+ ");
        // +는 regex 문법이므로, 그 자체를 구분자로 사용하기 위해 \\ 추가하여 사용하기.

        String firstTermStr = "";
        String constantTermStr = "";

        for(String term : onlyTerm) {
            if(term.indexOf('x') > -1) {
                // x를 제외한 값을 삽입하기.

                String termSub = term.substring(0, term.length() - 1);
                firstTermStr += termSub.equals("") ? "1 " : termSub + " "; // 일차항 계수 1인 경우 처리
            }
            else {
                constantTermStr += term + " ";
            }
        }

        int firstTerm = 0;
        int constantTerm = 0;

        if(firstTermStr.length() > 0) for(String i : firstTermStr.split(" ")) firstTerm += Integer.parseInt(i);
        if(constantTermStr.length() > 0) for(String i : constantTermStr.split(" ")) constantTerm += Integer.parseInt(i);

        String answer = (firstTerm == 1 ? "x" : firstTerm + "x") + " + " + constantTerm;
        
        if(constantTerm == 0) return (firstTerm == 1 ? "x" : firstTerm + "x");
        if(firstTerm == 0) return constantTerm + "";
        
        return answer;
    }
}