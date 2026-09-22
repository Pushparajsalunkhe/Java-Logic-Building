import java.util.*;
public class CountEvenOdd 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Array Size: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter The Elemrnt in Array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int count_even=0,count_odd=0,j=0;
        while(j<size)
        {
            if(arr[j]%2==0)
            {
                count_even++;
            }
            else
            {
                count_odd++;
            }
            j++;
        }

        System.out.println("Even Count is: "+count_even);
        System.out.println("Odd Count is: "+count_odd);
    }
}
