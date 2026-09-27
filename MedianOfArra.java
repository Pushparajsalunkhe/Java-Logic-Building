public class MedianOfArra 
{
    public static void main(String args[])
    {
        int arr[]={1,2,5,3,6,4,7,8};

        // Sort Array
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        int n=arr.length;

        if(n%2!=0)
        {
            System.out.println(arr[n/2]);
        }
        else
        {
            double median=(arr[n/2-1]+arr[n/2])/2.0; //(arr[8/2-1] + arr[8/2]) /2.0 = (arr[3]+arr[4])/2.0= (4+5)/2.0=9/2.0=4.5;
            System.out.println(median);
        }


        
    }
}
