import java.util.*;
class LinkList
{
    public static void main(String args[])
    {
        Deque<String> obj=new LinkedList<String>();
        obj.offer("RCB");
        obj.offer("MI");
        obj.offer("SRH");
        obj.offer("Kings 11");
        System.out.println(obj);
        obj.offerFirst("CSK");
        obj.offerLast("RR");
        System.out.println(obj);
        obj.poll();
        
        