public class SecondLargestElement 
{
    public static void main(String args[])
    {
        int []arr={12,34,56,78,90};
        int largest=arr[0],secondlargest=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }

        System.out.println("Largest Element is:"+largest);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>secondlargest && arr[i]!=largest)
            {
                secondlargest=arr[i];
            }
        }

        System.out.println("Second Largest Element is:"+secondlargest);
    }
}
