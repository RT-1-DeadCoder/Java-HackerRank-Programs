package HackerRank;

import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int []apples=new int[m];
        int []oranges=new int[n];
        int A,O,nA=0,nO=0;
        for(int i=0;i<m;i++)
        {
            apples[i]=sc.nextInt();
            A=apples[i]+a;
            if(A>=s&&A<=t)
            {
                nA++;
            }
        }
        for(int i=0;i<n;i++)
        {
            oranges[i]=sc.nextInt();
            O=oranges[i]+b;
            if(O>=s&&O<=t)
            {
                nO++;
            }
        }
        System.out.println(nA);
        System.out.println(nO);
    }
}
