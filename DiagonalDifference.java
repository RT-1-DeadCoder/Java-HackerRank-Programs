package HackerRank;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]a=new int[n][n];
        int s1=0,s2=0,Diff;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    s1 = s1 + a[i][j];
                }
                if(i==n-j-1)
                {
                    s2=s2+a[i][j];

                }
            }
        }
        Diff=s1-s2;
        System.out.println(Math.abs(Diff));
    }
}
