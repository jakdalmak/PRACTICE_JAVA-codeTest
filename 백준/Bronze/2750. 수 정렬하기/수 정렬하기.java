import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 데이터 개수

        int[] A = new int[N];
        for(int i = 0; i < N; i++) A[i] = scanner.nextInt(); // 정렬할 데이터 배열


        // 버블 정렬
        for(int i = 0; i < N-1; i++) { /* N이 아닌 N-1까지 간다. */
        // 본 for문은 루프의 개수 == 정렬할 데이터 개수를 나타낸다.
        // 정렬 데이터는 마지막 루프에서 0번째, 1번째 인덱스의 값을 swap하면 두 값을 모두 정렬한 결과를 얻는다.
        // 따라서 정렬할 데이터의 개수는 전체 데이터의 개수 - 1개. 정렬할 데이터의 개수 == 본 for문에서 필요한 루프의 개수므로 N-1개다.

            for(int j = 0; j < N - 1 - i; j++) { /* j < N - 1 - i에 집중.*/
            // 본 for문은 정렬 범위 내에서 swap 연산을 수행하기 위함이다.
            // 이 때, 정렬범위는 이미 정렬된 인덱스들을 제외해야하므로, N - 1에 추가적으로 - i를 수행하여
            // 정렬된 데이터의 개수만큼 정렬 범위를 제외한다.

                if(A[j] > A[j+1]) { // swap 연산을 수행하는 if문
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1 ] = temp;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
    }
}