public class duplicatepresent 
{
    public static void main(String args[])
    {
        int arr[]={20,46,73,85,46};
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
        }

        if(count==0)
        {
            System.out.println("Duplicate Element are not  Present:");
        }
        else{
            System.out.println("Duplicate Element are Present");

        }
    }
}
