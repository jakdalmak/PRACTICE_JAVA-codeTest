import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());
        int[] A = new int[N]; // 투 포인터 사용을 위한 배열 생성. 본 문제의 기입받는 값은 특정한 패턴이 없으므로 배열에 저장 필요.

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A); // 오름차순 정렬 수행

        int i = 0;
        int j = N-1;
        int count = 0;

        while(i < j) {
            int sum = A[j] + A[i];
            if(sum < M) i++;
            else if(sum > M) j--;
            else if(sum == M) {
                i++;
                j--;
                count++;
            }
        }

        System.out.println(count);
    }
}