class Solution {
    public int solution(int hp) {
        int ant = 0;

        while(hp != 0) {
            if(hp - 5 >= 0) {
                hp -= 5;
                ant++;
                continue;
            }

            if(hp - 3 >= 0) {
                hp -= 3;
                ant++;
                continue;
            }

            if(hp - 1 >= 0) {
                hp -= 1;
                ant++;
                continue;
            }
        }
        return ant;
    }
}