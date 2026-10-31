import java.util.*;
public class arrayuser 
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The Array Size");
       int size=sc.nextInt();
       int arr[]=new int[size];
       System.out.println("Enter Element in Array:");
       for (int i=0;i<size;i++)
       {
          arr[i]=sc.nextInt();
       }

       for(int j=0;j<size;j++)
       {
        System.out.print(arr[j] +" ");
       }

   } 
}
