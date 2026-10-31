public class stringIsPresentInEnd 
{
    public static void main(String args[])
    {
        String str1="Helloworld";
        String str2="world";


        if(str1.endsWith(str2))
        {
            System.out.println("Str2 ends with str1");

        }
        else
        {
            System.out.println("Str2 not ends with str1");
        }
    }
}
