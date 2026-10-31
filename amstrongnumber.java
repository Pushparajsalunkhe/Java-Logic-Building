import java.io.*;
import java.util.*;
public class amstrongnumber 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number:");
        int num=sc.nextInt();
        int temp=num;
        int sum=0,rem;
        while(num!=0)
        {
            rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }

        if(temp==sum)
        {
            System.out.println("Number is Amstrong:"+temp);
        }
        else{
            System.out.println("Number is not Amstrong:"+temp);
        }

    }
}
