public class twoDarray 
{
    public static void main(String args[])
    {
        int [][]arr={{1,2,3,4},{5,6,7,8},{9,1,8,6},{1,4,2,3}};
        int sumouter=0 ,suminner=0;
        int largest=arr[0][0];
        int smallest=arr[0][0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
               if(i==0 || j==0 || i==arr.length-1 || j==arr.length-1)
               {
                  sumouter=sumouter+arr[i][j];
                  System.out.print(arr[i][j]);
                  if(largest<arr[i][j])
                  {
                    largest=arr[i][j];
                  }
               }
               else
               {

                suminner=suminner+arr[i][j];
                 if(smallest>arr[i][j])
                 {
                    smallest=arr[i][j];
                 }
                System.out.print(" ");
               }
            }
            System.out.println();
        }
        System.out.println("Sum of Outer Element is:"+sumouter);
        System.out.println("Sum of Inner Element is:"+suminner);
        System.out.println("Largest Element is:"+largest);
        System.out.println("Smallest Element is:"+smallest);
    }
}
