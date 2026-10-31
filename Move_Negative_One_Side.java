public class Move_Negative_One_Side
{
    public static void main(String args[])
    {
      int arr[]={1,2,-1,5,-6,-9};
      int i=0;
      int j=0,temp;

      while(i<arr.length)
      {
        if(arr[i]>0)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;  
        }
        i++;
      }

      for(int k=0;k<arr.length;k++)
      {
          System.out.println(arr[k]);
      }
      
    }
}