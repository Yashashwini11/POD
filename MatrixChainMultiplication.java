// You are using Java
import java.io.*;
import java.util.*;
class Main 
{
    public static int minMultRec(int arr[],int i,int j)
    {
        if(i+1==j)
            return 0;
        int res=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++)
        {
            int curr=minMultRec(arr,i,k)+minMultRec(arr,k,j)+arr[i]*arr[k]*arr[j];
            res=Math.min(curr,res);
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(minMultRec(arr,0,n-1));
    }
}
