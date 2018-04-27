interface add2
{
    int addition(int a,int b);
}
class add
{
    public static void main(String args[])
    {
        add2 obj=(a,b)->{ return(a+b);};
        System.out.println(obj.addition(5,6));
    }
}