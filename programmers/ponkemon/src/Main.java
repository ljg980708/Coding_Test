import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3, 1, 2, 3};
        System.out.println(s.solution(arr));
    }

}

class Solution {

    public int solution(int[] nums) {

        int answer = 0;
        int n = nums.length / 2;

        if (n > Arrays.stream(nums).distinct().toArray().length) {
            answer = Arrays.stream(nums).distinct().toArray().length;
        } else {
            answer = n;
        }

        return answer;
    }
}
