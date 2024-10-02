// You are using Java
import java.io.*;
import java.util.*;
class Main
 {
     static int countways(int x,int n,int num)
     {
         int val=(int)(x-Math.pow(num,n));
         if(val==0)
         {
             return 1;
         }
         if(val<0)
            return 0;
            
            return countways(val,n,num+1)+countways(x,n,num+1);
     }
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         int n=sc.nextInt();
         System.out.print(countways(x,n,1));
     }
 }
