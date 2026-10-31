public class sumofduplicateelement
{
    public static void main(String args[])
    {
        int arr[]={20,46,73,85,46};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    sum=sum+arr[i];
                }
            }
        }

        System.out.println("Sum of Duplicate Element:"+sum);
    }
}
