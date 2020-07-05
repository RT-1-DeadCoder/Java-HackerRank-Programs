package HackerRank;

import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []grades=new int[n];
        for(int i=0;i<n;i++)
        {
            grades[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(grades[i]<38)
                continue;
            if(grades[i]%5>=3)
            {
                grades[i]=grades[i]+(5-grades[i]%5);
            }
            else
                continue;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(grades[i]);
        }
    }
}
