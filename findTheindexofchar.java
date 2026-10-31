

public class findTheindexofchar 
{
    public static void main(String args[])
   {
      String str="pushparaj";
      char ch='p';

      // for(int i=0;i<str.length();i++)
      // {
      //   if(ch==str.charAt(i))
      //   {
      //       System.out.println("index of "+ch+" is "+i);
      //       break;
      //   }
      // }

     for (int i=str.length()-1;i>=0;i--)
     {
        if(ch==str.charAt(i))
        {
           System.out.println("index of "+ch+" is"+i);
           break;
        }
     }
      

   }
}
