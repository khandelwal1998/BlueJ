import java.util.*;
class user
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=100;
        System.out.println("Enter divisor");
        int b=in.nextInt();
        user t=new user();
        try
        {
        t.check(b);
        }
        catch(Throwable e)
        {
            System.out.println("e is:"+e);
        }
    }
    public void check(int b)throws myexception
    {
        if(b==0)
        {
            throw new myexception(b);
        }
        else
        {
            System.out.println("OKAY");
        }
    }
}
class myexception extends Throwable
{
    public myexception(int a)
    {
        System.out.println("You have entered 0");
    }
}