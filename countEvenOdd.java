import java.util.*;
public class countEvenOdd 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter The Array Element:");

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int Evencount=0,Oddcount=0;

        for(int i=0;i<size;i++)
        {
            if(arr[i]%2==0)
            {
                Evencount++;
            }
            else
            {
                Oddcount++;
            }
        }

        System.out.println("Event Element Count is:"+Evencount);

        System.out.println("Odd Element Count is:"+Oddcount);

    }
}
