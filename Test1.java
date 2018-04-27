import java.util.*;
public class Test1
{
    public static void main(String args[])
    {
        gen<Integer> obj=new gen<Integer>(new Integer(20));
        gen<Double> obj2 = new gen<Double>(new Double(20.0));
        boolean flag=obj.compare(obj2);
        if(flag==true)
        {
            System.out.println("Both values are equal");
        }
        else
        {
            System.out.println("Value differ");
        }
    }
}