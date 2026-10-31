
public class exceptionHandeling 
{
    public static void main(String args[])
    {
        int a=10,b=0,c;
        try{
        c=a/b;
        System.out.println("Divisiton is: "+c);
        }
        catch(Exception e)
        {
           System.out.println("Number is not Divided By Zero");
        }
        finally
        {
            System.out.println("Pushparaj");
        }
    }
}
