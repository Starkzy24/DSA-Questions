// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//https://www.hackerrank.com/challenges/a-very-big-sum/problem

import java.util.*;

class Solution {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();

        //used long to store larger numbers and just simple addition then
        long[] array = new long[num];
        for(int i=0;i<num;i++)
        {
            array[i] = input.nextInt();
        }
        
        long ans = sum(num, array);
        System.out.println(ans);
        
        
    }
    
    public static long sum(int num, long[] array)
    {
        //just initial sum to 0 and keep on adding the running sum
        long sum = 0;
        for(int i =0;i<num;i++)
        {
            sum += array[i];
        }
        return sum;
    }
    
}
