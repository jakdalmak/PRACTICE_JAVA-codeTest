class Solution {
    public static int solution(int[] bandage, int health, int[][] attacks) {
        User user = new User(health, bandage[0], bandage[1], bandage[2]);


        int answer = health; // 0이하가 아닌 값이면 되므로 그냥 health 삽입해둠.
        int attackCount = 0;

        for(int i = 0; i <= attacks[attacks.length-1][0]; i++) {
            if(i == attacks[attackCount][0]) {
                answer = user.damaged(attacks[attackCount][1]);
                attackCount++;
            }
            else {
                user.bandage();
            }

            if(answer <= 0) return answer;
        }

        return answer;
    }

    public static class User {
        private int HP;

        private int MAX_HP;
        private int bandageTime;
        private int bandageHealTick;
        private int bandageCompleteHealTick;

        private int bandageFocusTime = 0; // 생성자에 넣지 않고, 기본값 그대로 사용.


        /** 생성자 */
        public User(int MAX_HP, int bandageTime, int bandageHealTick, int bandageCompleteHealTick) {
            this.HP = MAX_HP;
            this.MAX_HP = MAX_HP;
            this.bandageTime = bandageTime;
            this.bandageHealTick = bandageHealTick;
            this.bandageCompleteHealTick = bandageCompleteHealTick;
        }

        public void bandage() { // 마지막 공격을 받은 시점 기준이므로, 본 함수에서는 return 필요 X
            this.bandageFocusTime += 1;

            this.HP += bandageHealTick;

            // bandage()가 실행된 시점에서, bandageFocusTime이 0인 경우 == 붕대감기 성공적으로 완수한 것!
            if(this.bandageFocusTime == this.bandageTime) {
                this.HP += bandageCompleteHealTick;
                this.bandageFocusTime = 0;
            }

            // HP가 최대치 넘은경우 HP 최대치로 조정하기
            if(this.HP > this.MAX_HP) this.HP = this.MAX_HP;
        }

        public int damaged(int damage) {
            /*
            return된 값이 -1인경우 즉시 종료하기.
            아닌 경우에는 그대로 수행. 마지막 루프인경우 여기서 return된 값 그대로 return하기.
            */
            this.bandageFocusTime = 0; // 피격으로 인한 초기화
            return (this.HP -= damage) <= 0 ? -1 : this.HP;
        }
    }
}


