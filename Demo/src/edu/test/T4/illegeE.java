package edu.test.T4;

class illegeE extends    Exception
{
    public String getMessage()
    {
        return "Error in the values supplied to the ";
    }
}

class User
{
    int val1;
    int val2;
    public User(int a,int b)
    {
        val1=a;
        val2=b;
    }
    void show()throws illegeE
    {
        if((val1<0)||(val2>0))
            throw new illegeE();

        System.out.println("Value1="+val1);
        System.out.println("value2="+val2);
    }
}

class throwDemo
{
    public static void main(String args[])
    {
        User values=new User(-1,1);
        try
        {
            values.show();
        }
        catch(illegeE e)
        {
            System.out.println("illege :"+e.getMessage());
        }
    }
}
