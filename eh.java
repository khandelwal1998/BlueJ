import java.util.*;
import java.io.*;
class eh
{
    public static void main(String args[])
    {
        int a=5,b=2;
        try
        {
            int c=a/b;
            System.out.println(c);
            
        }
        /*catch(IllegalArgumentException e)
        {
            System.out.println(e);
        }*/
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Will be");
        }
    }
}