public class Last_Occurrence 
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,1,4,7,1,4,6,7};
        int ele=1;

        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==ele)
            {
                int index=i;
                System.out.println("Element is "+ele+" index is "+index);
                break;
            }
        }
    }
}
