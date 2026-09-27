public class Intersection 
{
    public static void main(String args[])
    {
        int arr[]={1,2,3};
        int arr1[]={4,5,6};
        int arr2[]=new int[arr.length];
        int l=0;
        for(int i=0;i<arr.length;i++ )
        {
            boolean flag=false;
            for(int k=0;k<i;k++)
            {
               if(arr[i]==arr2[k])
               {
                flag=true;
               }
            }

            if(flag==true)
            {
                continue;
            }
            for(int j=0;j<arr2.length;j++)
            {
                if(arr[i]==arr1[j])
                {
                    arr2[l]=arr[i];
                    l++;
                    break;
                }
            }

        }

        for(int n=0;n<l;n++)
        {
             System.out.println(arr2[n]);
        }

        
    }
}
