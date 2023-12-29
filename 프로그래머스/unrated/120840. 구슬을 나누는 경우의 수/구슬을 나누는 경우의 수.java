import java.util.*;
import java.math.BigInteger;

class Solution {
   public BigInteger solution(int balls, int share) {
        HashMap<Integer, BigInteger> factorialMap = new HashMap<>();

        memorize(factorialMap, balls);

        BigInteger ballFactorial = factorialMap.get(balls);
        BigInteger ballMinusShareFactorial = factorialMap.get(balls - share);
        BigInteger shareFactorial = factorialMap.get(share);

        BigInteger answer = ballFactorial.divide(ballMinusShareFactorial.multiply(shareFactorial));
        return answer;
    }

    public void memorize(HashMap<Integer, BigInteger> factorialMap, int balls) {
        BigInteger ballFactorial = BigInteger.ONE;

        for (int index = balls; index > 0; index--) {
            ballFactorial = ballFactorial.multiply(BigInteger.valueOf(index));
            factorialMap.put(index, ballFactorial);
        }
        
        factorialMap.put(balls, ballFactorial);
        // 가장 큰 팩토리얼을 저장.
        // 팩토리얼은 자기자신을 나누면 그 전값의 팩토리얼을 얻을 수 있음.
        // ex. 4! == 24, 3! == 6 이므로, 4! / 4 == 6

        for(int i = balls - 1; i >= 0; i--) {
            factorialMap.put(i, (factorialMap.get(i+1)).divide(BigInteger.valueOf(i+1)));
        }
    }
}