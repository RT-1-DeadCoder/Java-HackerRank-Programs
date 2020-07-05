package HackerRank;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        float po= 0,ne=0,z=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                po++;
            }
            if(a[i]<0)
            {
                ne++;
            }
            if(a[i]==0)
            {
                z++;
            }
        }
        System.out.printf("%.6f\n",po/n);
        System.out.printf("%.6f\n",ne/n);
        System.out.printf("%.6f\n",z/n);
    }
}
