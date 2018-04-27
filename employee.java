import java.io.*;
class employee implements Serializable
{
    String n;
    int num;
    employee(String name,int number)
    {
        this.n=name;
        this.num=number;
    }
    public String details()
    {
        String msg=n+" "+num;
        return(msg);
    }
}
