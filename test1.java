import java.util.*;
class test1
{
    public static void main(String args[])
    {
        Gen<String , Integer> obj=new Gen<String , Integer>("Hello",35);
        System.out.println(obj.getObject1());
        System.out.println(obj.getObject2());
        obj.showObjects();
        Gen<Integer , Double> obj1=new Gen<Integer , Double>(85,91.5);
        System.out.println(obj.getObject1());
        System.out.println(obj.getObject2());
        obj.showObjects();
    }
}
        