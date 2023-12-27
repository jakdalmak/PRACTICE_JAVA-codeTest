import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 숫자 기입받기
        
        int count = 0;
        
        while(count < n) {
            String line = "";
            
            for(int i = 0; i < count + 1; i++) line += "*";
            System.out.println(line);
            
            count++;
        }
    }
}