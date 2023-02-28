import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int score[] = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        Solution s = new Solution();
        s.solution(k, m, score);
    }
}
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        for(int i = score.length % m;i < score.length ;i++){
            if(i%m == score.length % m) {
                answer += score[i] * m;
            }
        }
        System.out.println(answer);
        return answer;
    }
}