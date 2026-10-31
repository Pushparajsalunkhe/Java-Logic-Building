import java.util.*;
public class numbercount
{    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        int count=0;
        while(num!=0)
        {
            count++;
            num=num/10;
        }

        System.out.println("Digit Count is:"+count);

    }
}
