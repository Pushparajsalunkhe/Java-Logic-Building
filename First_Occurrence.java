public class First_Occurrence
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,1,4,5,6,7,8,4};
        int ele=1;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ele)
            {
                int index=i;
                System.out.println("Element is "+ele+" Index is "+index);
                break;
            }
        }
    }
}