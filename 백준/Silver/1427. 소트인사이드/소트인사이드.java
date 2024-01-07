import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.next();
        // 값 기입받기

        int[] A = new int[N.length()];

        for(int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(N.substring(i, i+1));
        }


        for(int i = 0; i < A.length - 1; i++) {
            int swapIndex = i; // 각 swap 범위의 최초 인덱스(최댓값을 배치시킬 위치)를 저장해두기

            for(int j = i + 1; j < A.length; j++) { // swap 범위 내 최댓값 찾기
                if(A[j] > A[swapIndex]) {
                    swapIndex = j;
                }
            }

            // 아래와 같은 방식으로는 break 수행 불가능.
            // 반례 : 8 6 3 4 2 => swap 범위 6 ~ 2 인 경우...
            // if(swapIndex == i) break;

            // 찾아낸 최댓값으로 swap 시행.
            if(A[i] < A[swapIndex]) {
                int temp = A[i];
                A[i] = A[swapIndex];
                A[swapIndex] = temp;
            }
        }

        for(int k : A) System.out.print(k);
    }
}