///question
Given the dimension of a sequence of matrices in an array arr[], where the dimension of the ith matrix is (arr[i-1] * arr[i]), 
the task is to find the most efficient way to multiply these matrices together such that the total number of element multiplications is minimum. 
When two matrices of size m*n and n*p when multiplied, they generate a matrix of size m*p and the number of multiplications performed are m*n*p


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
