import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(s.solution(num));
    }
}
class Solution {
    public int solution(int n) {
        int answer = 1;
        int i = 1;
        while(true){
            if(answer % 3 == 0 || answer % 10 == 3 || answer / 10 == 3 || answer / 10 == 13){
                answer += 1;
            }else{
            if(i == n) break;
                answer +=1;
                i++;
            }
        }
        return answer;
    }
}
