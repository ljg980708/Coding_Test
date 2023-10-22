public class Main {
    public static void main(String[] args) {
        String[] card1 = {"i", "drink" ,"water" };
        String[] card2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        Solution s = new Solution();
        System.out.println(s.solution(card1, card2, goal));
    }
}
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        String answer = "Yes";
        int card1_index = 0;
        int card2_index = 0;

        for(int i=0;i<goal.length;i++){
            if(goal[i].equals(cards1[card1_index])){
                System.out.println(goal[i]+" "+cards1[card1_index]);
                if(card1_index < cards1.length -1){
                    card1_index += 1;
                }
            }
            else if (goal[i].equals(cards2[card2_index]) ) {
                System.out.println(goal[i]+" "+cards2[card2_index]);
                if(card2_index < cards2.length -1 ){
                    card2_index += 1;
                }
            }
            else { 
                return "No";
            }
        }
        
        return answer;
    }
}