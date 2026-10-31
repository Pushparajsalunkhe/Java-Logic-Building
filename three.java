import java.util.*;
public class three
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter The First Number:");
        int num1=sc.nextInt();
        System.out.println("Enter The Second Number:");
        int num2=sc.nextInt();
        System.out.println("Enter The Third Number:");
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3)
        {
            System.out.println("First Number is Greater:"+num1);
        }
        else if(num2>num1 &&num2>num3)
        {
           System.out.println("Second Number is Greater:"+num2);
        }
        else
        {
            System.out.println("Third Number is Greater:"+num3);
        }

    }
}