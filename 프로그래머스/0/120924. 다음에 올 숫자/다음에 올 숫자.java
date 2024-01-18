class Solution {
    public int solution(int[] common) {
        // 등차수열, 등비수열 중 무엇인지 확인하기. => 등차, 등비수열이 아닌 경우는 없음.
        // => 등비수열은 첫 값으로 나누면 모두 나누어질 것. => 등차수열도 그런 경우 있는데?
        
        // HINT ::
        // 등차수열[2] - 등차수열[1] == 등차수열[3] - 등차수열[2]
        // 위의 경우 만족하면 등차수열이다.
        // 아닌 경우에는 등비수열.
        
        // common의 길이는 최소 3이다.
        // 공차 == 등차수열[1] - 등차수열[0]
        // 공비 == 등비수열[1] / 등비수열[0]
        
        // 공차, 공비를 common의 마지막 값에 추가하여 result 도출하기
                
        int commonMeasure = common[1] - common[0]; // 공차
        int commonLaw = common[1] != 0 ? common[2] / common[1] : 0;  // 공비
        
        return common[1] - common[0] == common[2] - common[1] ? 
            common[common.length-1] + commonMeasure : common[common.length-1] * commonLaw;
    }
}