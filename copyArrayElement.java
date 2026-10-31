import java.util.*;
public class copyArrayElement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Array Size:");
        int size=sc.nextInt();

        int arr[]=new int[size];

        int arr1[]=new int[size];

        System.out.println("Enter The Array Element:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();

            arr1[i]=arr[i];
        }

        System.out.println("Copy Array Element is:");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}
