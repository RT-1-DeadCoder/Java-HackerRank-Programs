package HackerRank;

import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[]a=new long[5];
        long S1=0,S2=0,temp1,temp2;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextLong();
        }
        for (int i = 0; i <a.length; i++)
        {
            for (int j = i + 1; j <a.length; j++)
            {
                if (a[i] > a[j])
                {
                    temp1 = a[i];
                    a[i] = a[j];
                    a[j] = temp1;
                }
            }
        }
        for(int i=0;i<a.length-1;i++)
        {
            S1 = S1 + a[i];
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] < a[j]) {
                    temp2 = a[i];
                    a[i] = a[j];
                    a[j] = temp2;
                }
            }
        }
        for(int i=0;i<a.length-1;i++)
        {
            S2 = S2 + a[i];
        }
        System.out.printf("%d %d",S1, S2);
    }
}
