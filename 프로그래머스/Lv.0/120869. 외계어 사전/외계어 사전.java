class Solution {
    public int solution(String[] spell, String[] dic) {
        // spell의 모든 원소가 존재함을 확인해야한다.
        // => replace가 아닌, indexOf를 활용하여 존재여부를 확인하기.
        
        // 이를 위해, dic[] 과 크기가 동일한 int[] count배열을 하나 만든다.
        // spell[]의 원소에 해당하는 값과 dic[]의 원소 문자열간에 indexOf를 수행하고
        // 그 값이 -1보다 큰경우(존재하는 경우) count[] 배열에 ++를 수행한다.
        
        // spell[]의 모든 값을 dic[]의 모든 문자열에 대해 indexOf를 수행한 이후, 
        // count[]배열의 값이 spell.length와 동일한 값이 있는 경우 만들 수 있는 문장이 있는 것으로 판단하고
        // result를 1로 변경한다.
        
        // 이 때, 하나의 문장에 대해 모든 spell의 indexOf를 수행하고 하나씩 count를 비교할지,
        // 아니면 모든 문장에 대해 하나의 spell의 indexOf를 수행하는 것을 반복할지 선택할 것.
        
        // => 전자로 수행하도록 한다.
        // 전자로 수행하는 경우, 하나의 문장에 대해 indexOf를 반복하는 것이므로 count를 배열이 아닌 단순 변수로 제작한다.
    
        int result = 2;
        int count = 0;
        
        for(String str : dic) {
            count = 0;
            for(String chr : spell) {
                if(str.indexOf(chr) > -1) count++;
            }
            
            if(count == spell.length) {
                result = 1;
                break;
            }
        }
        
        return result;
    }
}