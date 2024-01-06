import java.util.*;

class Solution {
    public String solution(String my_string) {
        // 65 - 90 [A-Z]
        // 97 - 122 [a-z]
        char[] lowerString = my_string.toLowerCase().toCharArray();
        // split("") 대신 toCharArray로 한 글자씩 나누어 char[]형으로 저장
        Arrays.sort(lowerString);
        
        return new String(lowerString);
    }
}