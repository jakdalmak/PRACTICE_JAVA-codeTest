#include <stdio.h>

main() {
    int N;
    
    scanf("%d", &N); // 숫자의 개수 입력받음.
    
    char strArr[N]; // 숫자 개수만큼 배열 선언.
    int Sum = 0;
    
    scanf("%s", strArr); // 배열 내에 값 입력받음 
    
    for(int i = 0; i < N; i++) {
        Sum += strArr[i]  - '0';    
    }
    
    printf("%d", Sum);
}