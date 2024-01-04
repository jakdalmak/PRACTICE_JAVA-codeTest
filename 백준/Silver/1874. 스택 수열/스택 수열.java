import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int[] A = new int[N];

        // i == 실행 횟수 카운트
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(bufferedReader.readLine());
        }



        Stack<Integer> stack = new Stack<>();

        int num = 1; // num == 스택에 삽입할 기준값 ++

        boolean result = true;
        StringBuffer bf = new StringBuffer();
        for(int i = 0; i < N; i++) {
            int su = A[i]; // su == 수열을 만들기위해 현재 pop해야할 수열의 번째 값

            if(su >= num) {
                while(su >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else { // su < num 인경우 == 현재 구현할 값이 스택에 삽입할 값보다 작은 경우
                int n = stack.pop();
                if(n > su) {
                    System.out.print("NO");
                    result = false;
                    break;
                }else {
                    bf.append("-\n");
                }
            }
        }

        if(result) System.out.print(bf.toString());


    }
}