// You are using Java
import java.io.*;
import java.util.*;
class Main 
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            arr.add(i);
        }
        int j=1;
        while(arr.size()>1)
        {
            if(j%2!=0)
            {
                for(int l=0;l<arr.size();l++)
                {
                    arr.remove(l);
                }
            }
            else if(j%2==0)
            {
                for(int m=arr.size()-1;m>=0;m-=2)
                {
                    arr.remove(m);
                }
            }
            j++;

        }
        System.out.print(arr.get(0));
    }
}
