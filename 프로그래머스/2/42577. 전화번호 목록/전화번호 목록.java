import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 접두어인경우가 있으면 false, 없으면 true
        
        Arrays.sort(phone_book); // 사전 순 정렬
        
        // 슬라이딩 윈도우 방식 활용하여 n, n+1을 비교하게 하면 되지않나?
        for(int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) return false;
        }

        return true;
    }
}