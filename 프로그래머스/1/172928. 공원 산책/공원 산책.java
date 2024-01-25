class Solution {
    public int[] solution(String[] park, String[] routes) {
        // 강아지의 시작지점은 언제나 변할 수 있음.
        // 강아지가 이동하고자 하는 방향에 X가 위치하거나, 배열의 끝인 경우
        // 강아지는 다음이동을 수행하게 됨 == 현재 이동시도 롤백
        
        
        int[] answer = {};

        /** 강아지의 시작 위치 S가 어디에 위치해있는지 찾기 */
        for(int i = 0; i < park.length; i++) {
            int index = park[i].indexOf("S");
            if(index > -1) {
                answer = new int[]{i, index};
                break;
            }
        }

        /** 강아지의 위치에서 다음에 방문할 위치 찾기 */

        for(String route : routes) {
            char[] wayward = route.toCharArray();
            int xWay = 0;
            int yWay = 0;

            /** 이동할 방향과 칸 수 선택 */
            switch(wayward[0]) {
                case 'E' :
                    xWay = (wayward[2] - '0');

                    /** 이동할 위치가 배열의 끝인 경우 */
                    if(park[0].length()-1 < answer[1] + xWay) continue;

                    /** 이동할 위치가 장애물이거나 가는 길이 장애물로 막힌 경우 */
                    if(checkXway(park, xWay, answer)) continue;
                    break;
                case 'W' :
                    xWay = (int)(wayward[2] - '0') * -1;

                    if(0 > answer[1] + xWay) continue;

                    if(checkXway(park, xWay, answer)) continue;
                    break;
                case 'N' :
                    yWay = (int)(wayward[2] - '0') * -1;

                    if(0 > (answer[0] + yWay)) continue;

                    if(checkYway(park, yWay, answer)) continue;
                    break;
                case 'S' :
                    yWay = (wayward[2] - '0');

                    if(park.length-1 < (answer[0] + yWay)) continue;

                    if(checkYway(park, yWay, answer)) continue;
                    break;
            }

            /*
            아래 코드는 해당 위치 '만' 확인하는 코드임...

            if(park[answer[0] + yWay].charAt(answer[1] + xWay) == 'X') continue;
            System.out.print((answer[0] + yWay) + ", " + (answer[1] + xWay) + "에 위치한 값 찾기");
            */

            /** 위 검증 모두 통과한 경우에만 수행. */
            answer[0] += yWay;
            answer[1] += xWay;
        }


        return answer;
    }
    
    public static boolean checkXway(String[] park, int xWay, int[] answer) {
        int point = answer[1] + xWay;

        if(xWay > 0) {
            for(int i = answer[1]; i <= point; i++) {
                if(park[answer[0]].charAt(i) == 'X') return true;
            }
        }
        else if(xWay < 0) {
            for(int i = answer[1]; i >= point; i--) {
                if(park[answer[0]].charAt(i) == 'X') return true;
            }
        }

        return false;
    }

    public static boolean checkYway(String[] park, int yWay, int[] answer) {
        int point = answer[0] + yWay;

        if(yWay > 0) {
            for(int i = answer[0]; i <= point; i++) {
                if(park[i].charAt(answer[1]) == 'X') return true;
            }
        }
        else if(yWay < 0) {
            for(int i = answer[0]; i >= point; i--) {
                if(park[i].charAt(answer[1]) == 'X') return true;
            }
        }

        return false;
    }
}