public class FindFrequency 
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,2,7,3,1,9,1,2,1};
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            boolean flag=false;
            for(int k=0;k<i;k++)
            {
                if(arr[i]==arr[k])
                {
                    flag=true;
                }
            }

            if(flag==true)
            {
                continue;
            }
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            System.out.println(arr[i]+" Element Frequency is: "+count);
        }
    }
}
