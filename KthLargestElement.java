public class KthLargestElement 
{
    public static void main(String args[])
    {
        int arr[]={3,2,1,5,6,4};
        int k=3;

        for(int i=0;i<k;i++)
        {
            int max=arr[0];
            int index=0;

            for(int j=1;j<arr.length;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                    index=j;
                }
            }

            arr[index]=Integer.MIN_VALUE;

            if(i==k-1)
            {
                System.out.println(max);
            }

        }
        
    }
}
