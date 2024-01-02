import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public static int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        int i = 2;

        while(i <= n) {
            if(n % i == 0) {
                set.add(i);
                n /= i;
                continue;
            }
            i++;
        }

        int[] answer = set.stream().mapToInt(k -> k).toArray();

        Arrays.sort(answer);

        return answer;
    }
}