import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] checkArr;
    static int[] myArr;
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // 첫 번째 기입
        int S = Integer.parseInt(stringTokenizer.nextToken()); // 기준 문자열 크기
        int P = Integer.parseInt(stringTokenizer.nextToken()); // 부분 문자열 크기

        int Result = 0; // 비밀번호 가능 개수

        checkArr = new int[4]; // 비밀번호 조건 배열
        myArr = new int[4]; // 현재 부분문자열 조건 배열

        char[] A = new char[S]; // 기준 문자열 데이터

        checkSecret = 0; // 현재 부분 문자열이 4 - @개수만큼의 부분 문자열 조건 부합하는지 카운트하는 조건 변수,

        // 두 번째 기입
        A = bufferedReader.readLine().toCharArray();

        // 세 번째 기입
        stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 비밀번호 조건 배열 기입
        for(int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            if(checkArr[i] == 0) { // 조건으로 기입받은 값이 0인 경우 == 해당 문자를 필요로 하지 않는 경우
                checkSecret++; // 해당 값이 4인지, 아닌지에 따라 Result++ 수행하므로, 이와 같이 작성한다.
            }
        }

        // 부분 문자열 확인 루프
        for(int i = 0; i < P; i++) {
            Add(A[i]);
        }

        if(checkSecret == 4) Result++;

        // 슬라이딩 윈도우
        for(int i = P; i < S; i++) {
            int j = i - P; // j는 부분 문자열의 시작 지점.

            Add(A[i]); // 새롭게 들어온 문자 값에 대해 조건대질 수행.
            Remove(A[j]); // 나간 문자에 대해 조건대질 수행.

            if(checkSecret == 4) Result++;
        }

        System.out.println(Result);
        bufferedReader.close();
    }

    private static void Remove(char c) {
        switch(c) {
            case 'A' :
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C' :
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G' :
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T' :
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    // 현재 부분 문자열의 조건 만족 카운팅을 수행하는 함수
    private static void Add(char a) {
        switch(a) {
            case 'A' :
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C' :
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G' :
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T' :
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }
}