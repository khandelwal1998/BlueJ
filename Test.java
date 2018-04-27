import java.io.*;
class Test implements Serializable
{
    int i=10,j=20;
    transient int k=30;
    transient static int l=40;
    transient final int m=50;
    public static void main(String args[]) throws Exception
    {
        Test input=new Test();
        FileOutputStream f=new FileOutputStream("/home/abhishek/file1.txt");
        ObjectOutputStream f1=new ObjectOutputStream(f);
        f1.writeObject(input);
        FileInputStream fin=new FileInputStream("/home/abhishek/file1.txt");
        ObjectInputStream ois=new ObjectInputStream(fin);
        Test output=(Test)ois.readObject();
        System.out.println("i =: "+output.i);
        System.out.println("j =: "+output.j);
        System.out.println("k =: "+output.k);
        System.out.println("l =: "+output.l);
        System.out.println("m =: "+output.m);
       
    }
}