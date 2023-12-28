class Solution {
    public int solution(int hp) {
        int ant = 0;

        // 아래 코드는 다음과 같이 간편화가 가능하다.
        // hp / 5 + hp % 5 / 3 + hp % 5 % 3
        
        // 나머지 연산에 대해 제대로 이해할 것.
        // 5로 나눈 값 + 5로 나눈 값의 나머지를 3으로 나눈 값 + 5로 나눈 값의 나머지를 3으로 나눈 값의 나머지

        // 주어지는 hp를 5, 3, 1로 분할해서 구하는 일체의 과정을 위의 수식으로 표현할 수 있다.

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
