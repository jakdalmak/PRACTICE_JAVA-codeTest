import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) set.add(my_string.charAt(i));

        for(Character chr : set) answer += chr;

        return answer;
    }
}