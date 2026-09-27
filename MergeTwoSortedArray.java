public class MergeTwoSortedArray 
{
    public static void main(String args[])
    {
        int arr1[]={1,3,5};
        int arr2[]={2,4,6,7,8,9};
        int size=arr1.length+arr2.length;
        int arr3[]=new int[size];
        int i=0,j=0,l=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
              arr3[l]=arr1[i];
              i++;
            }
            else
            {
                arr3[l]=arr2[j];
                j++;
            }
            l++;
        }

        while(i<arr1.length)
        {
             arr3[l]=arr1[i];
             i++;
             l++;
        }

        while(j<arr2.length)
        {
            arr3[l]=arr2[j];
            j++;
            l++;
        }
        for(int k=0;k<size;k++)
        {
            System.out.println(arr3[k]);
        }

    }
}
