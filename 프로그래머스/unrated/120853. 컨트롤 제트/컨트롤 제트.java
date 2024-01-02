import java.util.ArrayList;
import java.util.StringTokenizer;

class Solution {
    public int solution(String s) {
        int answer = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        // 1. int[] 배열에 저장해두고, Z가 나오면 마지막 인덱스 고치기 => Z가 마지막에 나오는 경우 문제의 소지 있음
        // 2. ArrayList<Integer>() 이용하여, Z가 나오면 마지막 인덱스 날려버리기(remove)
        // => 동적 크기가 필요없나? len = s.trim().replace("Z", ""); len.length()를 통해 정적 길이를 구할 수는 있다만...

        ArrayList<Integer> list = new ArrayList<>();

        while(stringTokenizer.hasMoreTokens()) {
            String i = stringTokenizer.nextToken();
            if(i.equals("Z")) {
                list.remove(list.size()-1);
                continue;
            }

            list.add(Integer.parseInt(i));
        }

        for(int listValue : list) answer += listValue;

        return answer;
    }
}