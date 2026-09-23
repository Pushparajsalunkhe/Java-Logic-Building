public class FindMissingNumber 
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,5,6,8}; //11 6 6*(6+1)/2=6*7/2=42/2=21 25-21=4;
        int sum=0,len=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }

        int num=len*(len+1)/2;
        num=sum-num;
        System.out.println(num);
    }
}
