import java.util.*;

public class AverageOfArray 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter The Array Size:");
    int size=sc.nextInt();

    int arr[]=new int[size];
    System.out.println("Enter The Array Element:");
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
    
    int sum=0,avg=0;
    for(int i=0;i<size;i++)
    {
          sum=sum+arr[i];
    }
    
     avg=sum/size;
     System.out.println("Average of Array is:"+avg);
    }
}
