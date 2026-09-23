class FindOccurringMore
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,1,4,6,4,1,6};
        int n=4;

        n=n/2;

        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                 if(arr[i]==arr[j])
                 {
                    count++;
                 }
            }

            if(count>n)
            {
                System.out.println(arr[i] +" = "+count);
            }
        }
    }
}