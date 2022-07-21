import java.util.Arrays;

class Solution {
    public String solution(int n) {

        String n1 = Integer.toString(n);
        int[] answer = new int[n1.length()];

        for (int i = 0; i < n1.length(); i++){
            answer[i]+=n%10;
            n/=10;
        }
        String answer1 = Arrays.toString(answer);
        answer1 = answer1.replace(",","+");
        answer1 = answer1.replace("["," ");
        answer1 = answer1.replace("]","=");



        int num =0;
        for (int j = 0; j < n1.length(); j++){
            num += n%10;
            n/=10;
        }
        String s = Integer.toString(num);


        return answer1 + s;
    }





    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(718253));
    }

}