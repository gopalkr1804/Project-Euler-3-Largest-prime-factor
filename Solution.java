/*
The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of N ?
*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long max = -1;
            while(n%2==0)
            {
                max = 2;
                n= n/2;
            }
            for(int i=3;i<=Math.sqrt(n);i=i+2)
            {
                while(n%i==0)
                {
                    max = i;
                    n = n/i;
                }
            }
            if(n>2)
            max =n;
            System.out.println(max);
        }
    }
}

