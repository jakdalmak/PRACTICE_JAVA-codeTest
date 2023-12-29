import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(buffer.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long[] S = new long[suNo+1]; // 숫자형 데이터가 긴 경우(현재 문제 100000개 등) int 범위 벗어나는 문제 방지 위해 long 사용


        stringTokenizer = new StringTokenizer(buffer.readLine());

        // 참고. java는 배열의 기본값을 0으로 생성함.
        // 구간합은 기준 배열에 준하여 생성하는 것이므로, 최초의 값 S[0]는 0이어야 한다.
        // S[0]가 0이 아닌 경우는 해당 값이 0 초과의 인덱스 값을 지녀야 한다는 것.
        // => S[0]이 0이 아니면, S[0] = A[0] + S[-1]이어야 하니까 -1인 인덱스 값이라도 있어야 하는건가? 아니잖음.
        for(int i = 1; i<=suNo; i++) {
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
            // 구간합 배열 생성을 위한 별도의 배열 만들지 않고, 값을 기입하는 즉시 구간합 배열 생성 수행.
        }

        for(int q = 0; q<quizNo; q++) {
            stringTokenizer = new StringTokenizer(buffer.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(S[j] - S[i - 1]);
        }
    }
}