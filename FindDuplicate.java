
class FindDuplicate
{
    public static void main(String args[])
    {

        int arr[]={1,2,3,4,5,1,2,6,1,4,1,8,4,3};
        
        for(int i=0;i<arr.length;i++)
        {
            boolean flag=false;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=true;
                    break;
                }
            }

            if(flag==true)
            {
                continue;
            }
            for(int k=i+1;k<arr.length;k++)
            {
                if(arr[i]==arr[k])
                {
                    System.out.println("Duplicate Element is: "+arr[i]);
                    break;
                }
                
            }
        }
    }
}