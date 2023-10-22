public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1, 1000));
    }

    static class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            answer[0] = x;

            for(int i=1;i<n;i++){
                answer[i] = answer[i-1] + x;
            }

            return answer;
        }
    }
}

