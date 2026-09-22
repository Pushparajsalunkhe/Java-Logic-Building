import java.util.*;
public class AverageOfArray 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum=0,avg=0;

        System.out.println("Enter The Array Element: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<arr.length;j++)
        {
            sum=sum+arr[j];
        }

        avg=sum/size;
        System.out.println("Average Of Array is: "+avg);

    }
}
