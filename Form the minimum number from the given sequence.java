// You are using Java
import java.io.*;
import java.util.*;
class Main
{
    public static void minimumNumber(String str)
    {
        String result="";
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<=str.length();i++)
        {
            stack.push(i+1);
            if(i==str.length()|| str.charAt(i)=='I')
            {
                while(!stack.empty())
                {
                    result+=String.valueOf(stack.peek());
                    stack.pop();
                }
            }
        }
        System.out.print(result);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        minimumNumber(str);
    }
}
