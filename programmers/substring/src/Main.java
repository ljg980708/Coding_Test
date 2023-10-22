public class Main {
    public static void main(String[] args) {
        String t = "";
        String p = "";
        Solution s = new Solution();
        s.solution(t,p);
    }
}

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0;i < t.length() - (p.length() - 1); i++){
            if(Long.parseLong(p) >= Long.parseLong(t.substring(i,i+p.length()))){
                answer += 1;
            }
        }
        return answer;
    }
}