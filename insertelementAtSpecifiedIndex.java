import java.util.*;
public class insertelementAtSpecifiedIndex 
{
    public static void main(String args[])
    {
        delete();
    }

    static void insert()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter The Array Size");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter The Array Element:");
        for (int i=0;i<(arr.length-1);i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Array Element is:");
        for(int i=0;i<(arr.length-1);i++)
        {
            System.out.println(arr[i]);
        }
          
        System.out.println("Enter The Postion to insert The Element:");
        int pos=sc.nextInt();
        System.out.println("Enetr The Element in Array:");
        int value=sc.nextInt();
        for(int i=(arr.length-2);i>=pos;i--) // i=5-2 =3 3>=4 false 2>=4 false 1>=4 false 0>=4 false 
                                            // i=5-2=3  3>=3  true // 3>=2 false 2>=2 true
        {
                 arr[i+1]=arr[i];
        }
        arr[pos]=value;

        System.out.println("Array Element is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }

    static void delete()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter The Array Element:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array Element is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Enter The delete Postion:");
        int pos=sc.nextInt();
        for(int i=pos;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }

         System.out.println("Array Element is:");
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
