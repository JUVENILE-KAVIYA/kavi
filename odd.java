import java.io.*;
import java.util.*;
public class GUVI
{
    public static void main(String args[])
    {
        int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
        if(num>0)
        {
        if(num % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
        }
        else
            System.out.println("invalid");
    }
}
