import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        /* 첫 번째 답안 슈도 코드 */
        // 절댓값 크기 순으로 정렬하기.
        // 가장 큰 한 개의 절댓값을 선택. 나머지 다른 값들과 돌아가며 곱셈 수행.
        // 이때, 두 원본 값이 둘다 음수거나 양수인 경우면 반환.

        // ++) 두 값을 곱해야하는 시점에서 정답이 음수일 가능성은?
        // 있긴 하다. numbers가 2개의 원소를 지니고 음수하나 양수하나인 경우 음수또한 답으로 도출 될 수 있음.

        /* !! 첫 번째 제출 답안 => 폐기. 같은 수만 들어있는 배열 처리 불가 */
        /*
        if(numbers.length == 2) return numbers[0] * numbers[1];
        // 답이 무조건 음수인 유일한 경우인 numbers.length == 2인 경우는 별도의 if문으로 처리.

        int[] absNumbers = Arrays.stream(numbers).map(i -> Math.abs(i)).toArray();

        Map<Integer, Character> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) map.put(absNumbers[i], numbers[i] >= 0 ? '+' : '-');
        // 절댓값을 map의 key로 삼아 삽입하기.
        // 0도 일단 +로 작성한다.

        ArrayList<Integer> mapSorter = new ArrayList<>(map.keySet());
        Collections.sort(mapSorter, Collections.reverseOrder()); // 내림차순
        // map key로 절댓값을, value로 기존 값이 + / - 여부 저장해두고,
        // 맵 자체를 key 기준으로 sort, 이후 keyset활용하여 foreach 순회하며 두 개의 값에 대해 곱한 값이 양수인 경우 찾기.

        int answer = 0;

        for(int i = 0; i < mapSorter.size() - 1; i++) {
            for(int j = i + 1; j < mapSorter.size(); j++) {
                if(map.get(mapSorter.get(i)) == map.get(mapSorter.get(j)) 
                   && mapSorter.get(i) * mapSorter.get(j) != 0) {
                    // 둘 다 기존 값이 양수 또는 음수인경우, 곱하는 값에 0이 들어있지 않은 경우
                    answer = mapSorter.get(i) * mapSorter.get(j);
                    return answer;
                }
            }
        }

        return answer; // 만약 답이 0인경우, 0을 return
        */
        
        /* 두 번째 답안 슈도 코드 */
        // 답이 무조건 음수인 경우 == length 2에 +, -
        // 답이 무조건 0인 경우 == + 0 / - 0 / + - 0
        // 배열 내에는 중복이 가능하다.
        // 다 필요없고 그냥.. 돌리기.
        
        /* 두 번째 답안 */
        /*
        int answer = Integer.MIN_VALUE;
        
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int num = numbers[i] * numbers[j];
                if(answer < num) answer = num;
            }
        } 
        
        return answer;
        */
        
        
        /* 세 번째 답안 => 다른 사람 풀이 */
        // Arrays.sort()와 Math.max를 이용하기.
        // 현재 배열에는 음수, 0, 양수가 모두 존재한다.
        // 배열 자체를 오름차순 sort하여 최저값 두개와 최대값 두개를 곱한 값을 Math.max()로 비교하여 return하기
        // 답이 0인 경우도 처리 가능한 가장 간단한 방법!!
        
        Arrays.sort(numbers);
        
        return Math.max(numbers[0] * numbers[1], numbers[numbers.length-2] * numbers[numbers.length-1]);
        
        
    }
}