import java.util.*;
public class twoarraysame 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First Array Size:");
        int size1=sc.nextInt();
        System.out.println("Enter The Second Array Size:");
        int size2=sc.nextInt();

        if(size1==size2)
        {   
            System.out.println("Both Array Are Equal in Size");
            int arr1[]=new int[size1];
            System.out.println("Enter The Element in First Array:");
            for(int i=0;i<arr1.length;i++)
            {
               arr1[i]=sc.nextInt();
            }

            int arr2[]=new int[size2];
            System.out.println("Enter The Element in Second Array:");
            for(int j=0;j<arr2.length;j++)
            {
                arr2[j]=sc.nextInt();
            }
            boolean flag=false;
            for(int i=0;i<arr1.length;i++)
            {
                if(arr1[i]==arr2[i])
                {
                    flag=true;
                } 
            }

            if(flag==true)
            {
                System.out.println("Both Array Are Equal");
            }
            else
            {
                System.out.println("Both Array Are Not Equal");
            }
            

        }
        else
        {
            System.out.println("Array Size is Not Maching");
        }

    }
}
