import java.util.*;
class hashmap
{
    public static void main(String args[])
    {
        HashMap<Integer, String> obj=new HashMap<Integer, String>();
        obj.put(25,"Vineet");
        obj.put(26,"AAshhi");
        obj.put(28,"Abhishek");
        System.out.println(obj.entrySet());
        System.out.println(obj.keySet());
        System.out.println(obj.values());
        obj.remove(25);
        System.out.println(obj);
    }
}