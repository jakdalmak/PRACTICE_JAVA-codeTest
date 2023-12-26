import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        // 과제1. 최빈값을 리턴하려면 카운트를 수행해야함.
        // array에 대해 중복제거 수행하여, 카운트할 각 값의 내용 구함.
        HashSet<Integer> arrSet = new HashSet<>();
        
        for(int i : array) arrSet.add(i);
        
        int index = 0;
        
        int[] distinctArray = new int[arrSet.size()];
        
        for(int i : arrSet) distinctArray[index++] = i;
        // => 완료 - 중복제거된 값의 내역 얻음.
        
        
        // 과제 1. 중복제거된 각 값을 참조하여 array 내에 각 값이 몇 개씩 있는지 카운트를 수행해야함.
        // 카운트 수행과 동시에 최빈값에 대해 미리 구해두기
        ArrayList<Integer> countArr = new ArrayList<>();
        int previousLARGECount = 0;
        int largeInteger = 0;
        
        for(int i = 0; i < distinctArray.length; i++) {
            int count = 0;
            
            for(int j = 0; j < array.length; j++) {
                if(array[j] == distinctArray[i]) {
                    count++;
                }
            }
            
            if(previousLARGECount <= count) { 
                largeInteger = distinctArray[i]; // 현재 순회중인 값이 현재 루프기준 제일 최빈값
                previousLARGECount = count; // 최대 카운트값 초기화
            }
            // 최빈값을 지니는 인덱스'값' 미리 구해두기
         
            countArr.add(i, count); // distinctArr의 각 인덱스번째에 해당하는 값들의 카운트 값에 대해 지니는 ArrayList 생성. 
        }
        
        // => 완료 - 중복제거된 값의 카운트 내역에 대해 얻음.
        
        

        // 과제 2. 예외처리 - 중복제거된 값 카운트의 최빈수가 중복일 경우 -1 반환하는 예외처리
        Collections.sort(countArr); // 오름차순 정렬
        if(countArr.size() > 1 && countArr.get(countArr.size()-1) == countArr.get(countArr.size()-2)) return -1;
        
        
        return largeInteger;
    }
}
                
    
        
        
        
     