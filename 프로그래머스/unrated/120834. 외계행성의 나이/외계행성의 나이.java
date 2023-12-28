class Solution {
    public String solution(int age) {
        // a부터 j까지 0~9를 나타냄.
        // 1. 각 영문별로 치환할 수 있게끔 switch문 사용
        // 2. age 변수를 1의 자리씩 하나씩 변환
        String strAge = Integer.toString(age);
        String answer = "";

        for(int i = 0; i < strAge.length(); i++) {
            int oneNum = age % 10; // 원본값의 1의 자리 추출
            age /= 10; // 원본값 1의 자리 날림

            // 추가 문제.
            // 1의 자리부터 변경을 시행하므로, String에 값 추가시 1의 자리 ~ 최종 자리 까지 반대로 수행됨.
            // 마지막에 String을 거꾸로 작성할 것.
            switch(oneNum) {
                case 0 :
                    answer += "a";
                    break;
                case 1 :
                    answer += "b";
                    break;
                case 2 :
                    answer += "c";
                    break;
                case 3 :
                    answer += "d";
                    break;
                case 4 :
                    answer += "e";
                    break;
                case 5 :
                    answer += "f";
                    break;
                case 6 :
                    answer += "g";
                    break;
                case 7 :
                    answer += "h";
                    break;
                case 8 :
                    answer += "i";
                    break;
                case 9 :
                    answer += "j";
                    break;
            }
        }

        String reverseStr = "";

        for(int i = answer.length(); i > 0; i--) {
            reverseStr += answer.charAt(i-1);
        }
        return reverseStr;
    }
}