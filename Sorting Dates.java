// You are using Java
import java.io.*;
import java.util.*;
class Main 
{
    public static int compareDates(int[] date1,int[] date2)
    {
        if(date1[2]!=date2[2])
        {
            return Integer.compare(date1[2],date2[2]); //comparing years of 2 dates
        }
        if(date1[1]!=date2[1])
        {
            return Integer.compare(date1[1],date2[1]);
        }
         
            return Integer.compare(date1[0],date2[0]);
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dates[][]=new int[n][3];
        for(int i=0;i<n;i++)
        {
            dates[i][0]=sc.nextInt(); //date
            dates[i][1]=sc.nextInt(); //month
            dates[i][2]=sc.nextInt(); //year
        }
        Arrays.sort(dates,Main::compareDates);
        for(int i=0;i<n;i++)
        {
            System.out.println(dates[i][0]+" "+dates[i][1]+ " "+dates[i][2]);
        }
    }
}
