class demo
{
    public void sample(String x) throws NullPointerException
    {
         System.out.println(x.length());
    }
}

public class throwskeyword 
{
    public static void main(String args[])
    {
        demo d=new demo();
        try
        {
            d.sample(null);
        }
        catch(NullPointerException e)
        {
            System.out.println("String is NUll");
        }
        
    }
    
}
