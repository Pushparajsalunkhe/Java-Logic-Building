public class MergeTwoArray 
{
    public static void main(String args[])
    {
        int arr1[]={1,2,3,4};
        int arr2[]={5,7,8,9,10,11,12};
        int size=arr1.length+arr2.length;
        int arr3[]=new int[size];
        int i=0 , j=0;
        while(i<arr1.length)
        {
            arr3[i]=arr1[i];
            i++;
            j++;
        }
        i=0;
        while(j<size)
        {
            arr3[j]=arr2[i];
            j++;
            i++;
        }

        for(int k=0;k<arr3.length;k++)
        {
            System.out.println(arr3[k]);
        }
    }
}
