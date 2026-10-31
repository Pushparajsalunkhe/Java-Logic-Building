import java.util.*;
public class checknum 
{
    public static void main(String args[])
        {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter The Array Size");
           int size=sc.nextInt();

           int arr[]=new int[size];
           System.out.println("Enter The Array Element");
           for(int i=0;i<arr.length;i++)
           {
              arr[i]=sc.nextInt();
           }

            // System.out.println("Array Element Are:");
            // for(int i=0;i<arr.length;i++)
            // {
            //     System.out.println(arr[i]);
            // }

            System.out.println("Enter The Element");
            int num=sc.nextInt();
            boolean count=false;
    
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==num)
                { 
                    count=true;
                    break;
                }
            }

            if(count==true)
            {
                System.out.println("Element is Found:"+num);
            }
            else{
                System.out.println("Element is not Found:"+num);
            }

        }
    
}
