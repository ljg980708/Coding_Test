public class Main {
    public static void main(String[] args) {
        String str = "z";
        String skip = "abcdefghij";
        int index = 20;
        Solution s = new Solution();
        System.out.println(s.solution(str,skip,index));
    }
}
class Solution {
    public String solution(String s, String skip, int index) {
        char[] arr_s = s.toCharArray();
        char[] arr_skip = skip.toCharArray();
        int idx = 0;
        for(int i = 0 ; i < arr_s.length ; i++){
            for(int j = 0 ; j < index ; j++){
                arr_s[i] += 1;
                while(true){
                    idx = 0;
                    for(int k = 0 ; k < arr_skip.length ; k++){
                        if((arr_s[i] - 97) % 26 + 97 == arr_skip[k]){
                            arr_s[i] += 1;
                            idx += 1;
                        }
                    }
                    if(idx==0) break;
                }
            }
            if(arr_s[i] > 122) arr_s[i] = (char)((arr_s[i] - 97) % 26 + 97);
        }
        return String.copyValueOf(arr_s);
    }
}