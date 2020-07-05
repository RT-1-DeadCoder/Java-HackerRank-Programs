package HackerRank;

import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        int n,c=0,L=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

            if(a[i]>L)
            {
                L=a[i];
            }
        }
        for(int j=0;j<n;j++)
        {
            if(L==a[j])
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
