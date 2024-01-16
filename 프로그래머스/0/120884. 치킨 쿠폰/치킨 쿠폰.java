class Solution {
    public int solution(int chicken) {
        // 최대 서비스 치킨의 수를 구하는 것.
        // 쿠폰 열장 -> 치킨 한마리 서비스
        // 치킨 한 마리당 쿠폰 하나
        
        // 초기 값인 chicken은 사실상 현재 가지고 있는 서비스 쿠폰 개수로 봐도 됨.
        // chiken / 10 == 1번째 쿠폰 개수로 시켜먹은 치킨의 개수
        
        // 남는 쿠폰 개수를 저장해두어야 함. 별도의 변수 필요.
        
        int answer = 0;
        int coupon = chicken;
        while(coupon >= 10) {
            chicken = coupon / 10; // 치킨의 개수는 쿠폰 10장 == 치킨 1개므로...
            
            coupon %= 10; // 쿠폰으로 치킨을 시키면, 10으로 나눈 나머지만 남아야 함.
            coupon += chicken; // 서비스 치킨도 쿠폰을 준다... 치킨집 혜자네..
            
            answer += chicken;
        }
        
        
        return answer;
    }
}