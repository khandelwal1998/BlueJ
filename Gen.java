class Gen<t1,t2>
{
    t1 obj;
    t2 obj2;
    Gen(t1 ob1,t2 ob2)
    {
        obj=ob1;
        obj2=ob2;
    }
    t1 getObject1()
    {
        return obj;
    }
    t2 getObject2()
    {
        return obj2;
    }
    void showObjects()
    {
        System.out.println("Class of object1: "+ obj.getClass());
        System.out.println("Class of object2: "+ obj2.getClass());
    }
}