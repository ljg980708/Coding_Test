import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Solution s = new Solution();
        s.solution(array,commands);
        System.out.println(Arrays.toString(s.solution(array,commands)));
    }
}
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        int[] answer;
        for (int[] arr:commands) {
            int result = Arrays.stream(array)
                    .skip(arr[0]-1)
                    .limit(arr[1]-arr[0]+1)
                    .sorted()
                    .toArray()[arr[2]-1];
            list.add(result);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}