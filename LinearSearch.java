import java.util.*;
public class LinearSearch 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Array Size:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter The array Element: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter The Search Element: ");
        int ele=sc.nextInt();
        boolean flag=false;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==ele)
            {
                flag=true;
            }
        }

        if(flag==true)
        {
            System.out.println("Element is Found!");
        }
        else
        {
            System.out.println("Element is not Found!");
        }
    }
}
