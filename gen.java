class gen<T extends Number>
{
    T num;
    gen(T ob)
    {
        num=ob;
    }
    boolean compare(gen<?> obj2)
    {
        if(num.doubleValue() == obj2.num.doubleValue())
        return true;
        else
        return false;
    }
}