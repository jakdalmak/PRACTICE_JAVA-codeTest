import java.util.*;

class Solution {
    public int solution(int price) {
        int int_Answer = 0;
        
        
        if(price >= 500000) int_Answer = (int) Math.floor(price * 0.8);
        else if(price >= 300000) int_Answer = (int) Math.floor(price * 0.9);
        else if(price >= 100000) int_Answer = (int) Math.floor(price * 0.95);
        else int_Answer = price;

        return int_Answer;
    }
}