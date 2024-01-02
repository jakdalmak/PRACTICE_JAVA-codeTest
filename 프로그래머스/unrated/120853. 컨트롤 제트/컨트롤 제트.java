import java.util.Stack;
import java.util.StringTokenizer;

class Solution {
    public int solution(String s) {
        int answer = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        // 1. int[] 배열에 저장해두고, Z가 나오면 마지막 인덱스 고치기 => Z가 마지막에 나오는 경우 문제의 소지 있음
        // 2. ArrayList<Integer>() 이용하여, Z가 나오면 마지막 인덱스 날려버리기(remove)
        // => 동적 크기가 필요없나? len = s.trim().replace("Z", ""); len.length()를 통해 정적 길이를 구할 수는 있다만...
        
        
        // 그냥 ''스택''을 쓰면 해결될 일이다.
        // 자바는 스택, 리스트 등의 콜렉션을 따로 제공해줌!
        
        // 그냥 마지막 값만 뽑아도 되는 시점에서, 모든 값에 대해 인덱스를 매기는 ArrayList를 사용할 이유가 없음.
        
        Stack<Integer> stack = new Stack<>();
        //ArrayList<Integer> list = new ArrayList<>();
        

        while(stringTokenizer.hasMoreTokens()) {
            String i = stringTokenizer.nextToken();
            if(i.equals("Z")) {
                stack.pop(); //list.remove(list.size()-1);
                continue;
            }

            stack.push(Integer.parseInt(i)); //list.add(Integer.parseInt(i));
        }

        for(int listValue : stack/*list*/) answer += listValue;

        return answer;
    }
}