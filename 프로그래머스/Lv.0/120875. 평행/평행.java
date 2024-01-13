class Solution {
    public int solution(int[][] dots) {
        // 평행이거나 겹치는 경우(일치하는 경우)가 있으면 1 return
        
        // 모든 경우의 수를 따지며, 두 점에 대한 기울기를 구해서 기울기가 같은 경우를 반환하기.
        
        // 기울기는 y2 - y1 / x2 - x1로 구할 수 있음.
        // 기울기가 음수인 경우는 당연히 존재 가능하므로 그냥 위 공식 이용해서 구하면 될듯?
        
        // 01, 02, 03과 같이 두 점 고르는 세 가지 경우면 모든 기울기 파악 가능.
        // 두 개의 점이 선택되면 나머지 남은 두 개의 점을 선택할 수 있게 작성해야 함.
        // 어떻게...?
        
        int[][] selectArr = {{0, 1, 2, 3}, {0, 2, 1, 3}, {0, 3, 1, 2}};

        for(int i = 0; i < selectArr.length; i++) {
            int dot1 = selectArr[i][0];
            int dot2 = selectArr[i][1];
            int dot3 = selectArr[i][2];
            int dot4 = selectArr[i][3];

            double slope1 = (double)(dots[dot1][1] - dots[dot2][1]) / (dots[dot1][0] - dots[dot2][0]);
            double slope2 = (double)(dots[dot3][1] - dots[dot4][1]) / (dots[dot3][0] - dots[dot4][0]);

            if(slope1 == slope2) return 1;
        }

        return 0;
    }
}