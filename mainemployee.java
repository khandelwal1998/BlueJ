import java.util.*;
import java.io.*;
class mainemployee
{
    public static void main(String args[]) throws IOException
    {
        int c;
        FileOutputStream s=null;
        ObjectOutputStream s1=null;
        employee obj=new employee("Abhi",123);
        System.out.println("Data is: "+obj);
        s=new FileOutputStream("/home/abhishek/file1.txt");
        s1=new ObjectOutputStream(s);
        s1.writeObject(obj);
    }
}