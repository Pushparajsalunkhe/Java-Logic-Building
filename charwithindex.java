import java.util.*;
public class charwithindex 
{
    public static void main(String args[])
    {
        String str="pushparaj";
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter The Index:");
        int index=sc.nextInt();

        char ch=str.charAt(index-1);

        System.out.println("Charecter is:"+ch);

    }
}
