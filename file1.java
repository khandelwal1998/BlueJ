import java.io.*;
import java.util.*;
class file1
{
    public static void main(String args[]) throws IOException
    {
        Scanner in=new Scanner(System.in);
        FileInputStream f=new FileInputStream("/home/abhishek/q.txt");
        int c;
      
        /*while((c=f.read())!=-1)
        {
            System.out.print((char)c);
        }*/
        byte bin[]=new byte[100];
        if((c=f.read(bin))!=-1)
        System.out.println(new String(bin,0,bin.length));
        else
        System.out.println("Could not read");
      
    }
}