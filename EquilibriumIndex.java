public class EquilibriumIndex 
{
    public static void main(String args[])
    {
        int arr[]={1,2,0,3};

        for(int i=0;i<arr.length;i++)
        {
              int leftsum=0;
              for(int j=0;j<i;j++)
              {
                leftsum+=arr[j];
              }

              int rigthsum=0;
              for(int j=i+1;j<arr.length;j++)
              {
                  rigthsum+=arr[j];
              }

              if(leftsum==rigthsum)
              {
                System.out.println(i);
                break;
              }
        }
    }
}
