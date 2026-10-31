public class finallys 
{
public static void main(String args[])
    {
        int a=10,b=0,c;
        try
        {
            c=a/b;
            System.out.println("Division is: "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number is not Divide By Zero");
        }
        finally
        {
            System.out.println("Finally Block is Always Executed");
        }
    }

}
