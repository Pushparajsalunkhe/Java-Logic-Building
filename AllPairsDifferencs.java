class AllPairsDifferencs
{
    public static void main(String args[])
    {
        int arr[]={1, 4, 1, 4, 5};
        int k=3,count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]-arr[i]==k  || arr[i]-arr[j]==k)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}