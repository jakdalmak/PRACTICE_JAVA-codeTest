class Solution {
    public String solution(String my_string) {
        
        
        // 메소드말고 직접 돌려보기. 그냥..
        /*
        my_string = my_string.replaceAll("a", "");
        my_string = my_string.replaceAll("e", "");
        my_string = my_string.replaceAll("i", "");
        my_string = my_string.replaceAll("o", "");
        my_string = my_string.replaceAll("u", "");
        
        return my_string;
        */
        String[] strArr = my_string.split("");
        
        for(int i = 0; i < my_string.length(); i++) {
            // switch문은 String 비교 안됩니다~
            strArr[i] = strArr[i].equals("a") || strArr[i].equals("e") || strArr[i].equals("i") || strArr[i].equals("o") || strArr[i].equals("u") ? "" : strArr[i];

        }
        
        
        String answer = "";
        for(String i : strArr) answer += i;

        return answer;
    }

}
