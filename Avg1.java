class Avg1<T1 extends Number>
{
    T1 obj[];
    
    Avg1(T1 obj1[])
    {
        obj=obj1;
    }
    void getAvg()
    {
        double s=0;
      
        for(int i=0;i<5;i++)
        {
            s+=obj[i].doubleValue();
        }
        System.out.println("Average is: "+(s/5));
    }
}