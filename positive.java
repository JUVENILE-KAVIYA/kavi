import java.io.*;
import java.util.*;
public class posnegzer
{
    public static void main(String[]args)
    
    {
    int i;
     Scanner sc=new Scanner(System.in);
     i=sc.nextInt();
    if(i>0)
    System.out.println("Positive");
    else if(i<0)
    System.out.println("Negative");
    else
    System.out.println("Zero");
    
    }
}
