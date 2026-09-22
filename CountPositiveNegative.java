public class CountPositiveNegative 
{
    public static void main(String args[])
    {
        int arr[]={0,1,-1,5,3,0,-5,-7,-9};
        int count_pos=0,count_neg=0,count_zero=0;
        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]>0)
             {
                count_pos++;
             }
             else if(arr[i]<0)
             {
                count_neg++;
             }
             else
             {
                count_zero++;
             }
        }

        System.out.println("Count of Postive Element is: "+count_pos);
        System.out.println("Count of Negative Element is: "+count_neg);
        System.out.println("Count of Zero is: "+count_zero);
    }
}
