
//https://www.hackerrank.com/challenges/diagonal-difference/problem
// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.*;
import java.lang.Math;

class Solution {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //number of rows and columns
        int num = input.nextInt();
        int[][] matrix = new int[num][num];
        
        for(int i =0; i< num; i++)
        {
            for(int j =0; j < num; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }
        int ans = DiagonalDiff(num, matrix);
        System.out.println(ans);
        
        
        
    }
    
    public static int DiagonalDiff(int num, int[][] matrix)
    {
        int sum1 = 0; //to maintain the primary diagonal sum
        int sum2 = 0; //to maintain the secondary diagonal sum
        
        for(int i =0; i< num; i++)
        {
            for(int j =0; j < num; j++)
            {
                //To keep track of elements in the primary diagonal(ex - 00,11,22)
                if(i==j)
                {
                    sum1 += matrix[i][j];
                }

              
                //To keep track of elements in the secondary diagonal (ex - 02,11, 21) 
                // i + j = length of column - 1;
                if(i + j == num - 1)
                {
                    sum2 += matrix[i][j];
                }
                
            }
        }
        
        int res = Math.abs(sum1 - sum2);
        
        return res;
        
    }
    
}
