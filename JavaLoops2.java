package HackerRank;

import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of queries: ");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println("Enter the no. of terms: ");
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                a=a+ (int)Math.pow(2,j)*b;
                System.out.print(a + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
