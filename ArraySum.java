package HackerRank;

import java.util.Scanner;

public class ArraySum {
    public static void main(String args[])
        {
            int S=0;
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int []a =new int[n];
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
                S=S+a[i];
            }
            System.out.println(S);
        }
    }
