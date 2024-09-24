//https://www.hackerrank.com/challenges/compare-the-triplets/problem
import java.util.*;

public class AliceBob {
    public static void main(String[] args) {
        //Creating a scanner class to take inputs
        Scanner input =  new Scanner(System.in);
        //Created an array of size 3 for storing both scores individually
        int[] Alice = new int[3];
        int[] Bob = new int[3];
        
        //running a for loop to take the input
        for (int i = 0; i < 3; i++) {
            Alice[i]= input.nextInt();
        }
        //running a for loop to take the input
        for (int i = 0; i < 3; i++) {
            Bob[i]= input.nextInt();
        }

        //creating a fucntion to calculate scores for Alice and Bob
        int[] ans = Score(Alice, Bob);

        //returns the result in array format
        System.out.println(Arrays.toString(ans));



    }

    public static int[] Score(int[] Alice, int[] Bob)
    {
        //creating an empty array to store the results
        int[] res = {0,0};
        //running for loop from 0 to 2
        for (int i = 0; i < 3; i++) {
            if(Alice[i] > Bob[i])
            {
                res[0]++;
            } else if (Alice[i] < Bob[i]) {
                res[1]++;
            }
        }

        //returns the array containing scores
        return res;
    }
}
