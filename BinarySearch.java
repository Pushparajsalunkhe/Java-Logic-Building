import java.util.*;
class BinnarySearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Array Size:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter The Array Size");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter The Searching Element: ");
        int ele=sc.nextInt();
        boolean flag=false;
        int low=0,up=size-1,mid=0;
        while(low<up)
        {
            mid=(low+up)/2;
            if(arr[mid]==ele)
            {
                flag=true;
                break;
            }
            else if(arr[mid]>ele)
            {
                low=mid+1;
            }
            else
            {
               up=mid-1;
            }       
        }

        if(flag==true)
        {
            System.out.println("Element is Found !");
        }
        else
        {
            System.out.println("Element is Not Found");
        }

    }
}

