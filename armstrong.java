import java.util.*;
public class armstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter The Number:");
        int num=sc.nextInt();
        int rev,result=0,temp=num;
        while(num!=0)
        {
            rev=num%10;
            result=result+(rev*rev*rev);
            num=num/10;
        }  


        if(temp==result)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.printf("Number is Not Armstrong");
        }

    }
}
