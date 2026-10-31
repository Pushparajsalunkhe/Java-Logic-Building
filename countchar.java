//import java.util.*;
class countchar
{
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter The String");

        // String str=sc.nextLine(); 

        String str="aaabbcc";

        for(int i=0;i<str.length();i++)
        {
            int count=0;
            char ch=str.charAt(i);
            if(i>0 && str.charAt(i)==str.charAt(i-1))
            {
                continue;
            }

            for(int j=i;j<str.length();j++)
            {
                if(str.charAt(j)==ch)
                {
                    count++;
                }
            }

            System.out.print(ch+""+count);
        }

    }
}