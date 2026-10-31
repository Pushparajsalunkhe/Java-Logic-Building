public class rearrange_neg_pos_Alternat
{
    public static void main(String args[])
    {
        int arr[]={1,2,-1,4,6,-4,9,3,-7}; 
        int i=0,j=1;
        while(i<arr.length)
        {
           if(arr[i]>0)
           {
            i++;
           }
           else
           {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j=j+2;
            
           }
        }

        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
    }
}