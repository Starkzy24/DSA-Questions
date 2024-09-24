//https://www.hackerrank.com/challenges/compare-the-triplets/problem
import java.util.*;

public class AliceBob {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        int[] Alice = new int[3];
        int[] Bob = new int[3];

        for (int i = 0; i < 3; i++) {
            Alice[i]= input.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            Bob[i]= input.nextInt();
        }

        int[] ans = Score(Alice, Bob);
        System.out.println(Arrays.toString(ans));



    }

    public static int[] Score(int[] Alice, int[] Bob)
    {
        int[] res = {0,0};
        for (int i = 0; i < 3; i++) {
            if(Alice[i] > Bob[i])
            {
                res[0]++;
            } else if (Alice[i] < Bob[i]) {
                res[1]++;
            }
        }

        return res;
    }
}
